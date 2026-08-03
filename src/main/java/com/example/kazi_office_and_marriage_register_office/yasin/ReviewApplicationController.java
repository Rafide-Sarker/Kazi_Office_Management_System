package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ReviewApplicationController
{
    @javafx.fxml.FXML
    private Label nidLabelField;
    @javafx.fxml.FXML
    private Label fatherNameLabelField;
    @javafx.fxml.FXML
    private Label emailLabelField;
    @javafx.fxml.FXML
    private Label phoneNoLabelField;
    @javafx.fxml.FXML
    private Label motherNameLabelField;
    @javafx.fxml.FXML
    private Label fullNameLabelField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveAndSubmitButtonOnAction(ActionEvent actionEvent) throws IOException {
        // applicationId = ??

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText("Application Submitted Successfully!");
        myAlert.setContentText("Your Application ID :??");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToPersonalInformationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/personal-information-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("Personal Information!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}