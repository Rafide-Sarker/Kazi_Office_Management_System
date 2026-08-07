package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CurrentInformationController
{
    @javafx.fxml.FXML
    private Label brideNameLabel;
    @javafx.fxml.FXML
    private Label BrideAddressLabel;
    @javafx.fxml.FXML
    private Label groomEmailLabel;
    @javafx.fxml.FXML
    private Label brideEmailLabel;
    @javafx.fxml.FXML
    private Label groomNameLabel;
    @javafx.fxml.FXML
    private Label groomPhoneNumberLabel;
    @javafx.fxml.FXML
    private Label groomAddressLabel;
    @javafx.fxml.FXML
    private Label bridePhoneNumberLabel;

    private MarriageApplication application;

    @javafx.fxml.FXML
    public void initialize() {
        System.out.println("Current User Email = " + User.currentUser.getEmail());

        application = MarriageApplication.searchApplicationByUser("MarriageApplication.bin",
                User.currentUser.getEmail()
        );

        System.out.println("Application = " + application);

        if(application == null){
            return;
        }

        brideEmailLabel.setText(application.getEmailBride());
        brideNameLabel.setText(application.getFullNameBride());
        BrideAddressLabel.setText(application.getAddressBride());
        bridePhoneNumberLabel.setText(String.valueOf(application.getPhoneNumberBride()));

        groomEmailLabel.setText(application.getEmailGroom());
        groomNameLabel.setText(application.getFullNameGroom());
        groomAddressLabel.setText(application.getAddressGroom());
        groomPhoneNumberLabel.setText(String.valueOf(application.getPhoneNumberGroom()));

    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoard(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void editInformationAndGoToEditPage(ActionEvent actionEvent) throws IOException {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("yasin/edit-current-information-view.fxml"));
            Scene scene = new Scene(loader.load());
            EditCurrentInformationController controller = loader.getController();
            controller.setApplication(application);
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Edit Information!");
            nextStage.setScene(scene);
            nextStage.show();
        }
}