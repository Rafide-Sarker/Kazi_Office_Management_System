package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UploadDocumentsController
{
    @javafx.fxml.FXML
    private TextField bridePhotoTextField;
    @javafx.fxml.FXML
    private TextField dobCertificateTextField;
    @javafx.fxml.FXML
    private TextField nidCopyTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void chooseBridePhotoButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void chooseDobCertificateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void chooseNidCopyButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadAndGoToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(" Documents Uploaded Successfully!");
        myAlert.setContentText("Your documents have been uploaded successfully");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}