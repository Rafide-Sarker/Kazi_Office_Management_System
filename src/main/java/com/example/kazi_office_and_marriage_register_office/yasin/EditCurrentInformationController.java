package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import com.example.kazi_office_and_marriage_register_office.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EditCurrentInformationController
{
    @javafx.fxml.FXML
    private TextField brideNameTextField;
    @javafx.fxml.FXML
    private TextField brideAddressTextField;
    @javafx.fxml.FXML
    private TextField groomNameTextField;
    @javafx.fxml.FXML
    private TextField groomPhoneNumberTextField;
    @javafx.fxml.FXML
    private TextField groomEmailTextField;
    @javafx.fxml.FXML
    private TextField bridePhoneNumberTextField;
    @javafx.fxml.FXML
    private TextField groomAddressTextField;
    @javafx.fxml.FXML
    private TextField brideEmailTextField;
    private MarriageApplication application;

    public void setApplication(MarriageApplication application) {

        this.application = application;

        brideNameTextField.setText(application.getFullNameBride());
        brideAddressTextField.setText(application.getAddressBride());
        brideEmailTextField.setText(application.getEmailBride());
        bridePhoneNumberTextField.setText(String.valueOf(application.getPhoneNumberBride()));

        groomNameTextField.setText(application.getFullNameGroom());
        groomAddressTextField.setText(application.getAddressGroom());
        groomEmailTextField.setText(application.getEmailGroom());
        groomPhoneNumberTextField.setText(String.valueOf(application.getPhoneNumberGroom()));
    }

    @javafx.fxml.FXML
    public void initialize() {
        application = MarriageApplication.searchApplicationByUser("MarriageApplication.bin",
                User.currentUser.getEmail()
        );
    }


    @javafx.fxml.FXML
    public void confirmAndSaveAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        ArrayList<MarriageApplication> applicationList =
                MarriageApplication.readAllApplications("MarriageApplication.bin");

        for (MarriageApplication app : applicationList) {

            if (app.getApplicationID().equals(application.getApplicationID())) {

                app.setFullNameBride(brideNameTextField.getText());
                app.setAddressBride(brideAddressTextField.getText());
                app.setEmailBride(brideEmailTextField.getText());
                app.setPhoneNumberBride(
                        Integer.parseInt(bridePhoneNumberTextField.getText()));

                app.setFullNameGroom(groomNameTextField.getText());
                app.setAddressGroom(groomAddressTextField.getText());
                app.setEmailGroom(groomEmailTextField.getText());
                app.setPhoneNumberGroom(
                        Integer.parseInt(groomPhoneNumberTextField.getText()));

                break;
            }
        }

        MarriageApplication.rewriteBinaryFile("MarriageApplication.bin", applicationList);

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(null);
        myAlert.setContentText("Information Updated Successfully");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToCurrentInformationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/current-information-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Current Information!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}