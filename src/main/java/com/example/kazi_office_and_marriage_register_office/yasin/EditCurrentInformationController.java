package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EditCurrentInformationController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField brideNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void confirmAndSaveAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(null);
        myAlert.setContentText("Your Information Update successfully");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToCurrentInformationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/current-information-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("Current Information!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}