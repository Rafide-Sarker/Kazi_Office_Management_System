package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import com.example.kazi_office_and_marriage_register_office.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateUserAccountController
{
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private TextField confirmPasswordTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/system-admin-dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("System Admin Dashboard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) throws IOException{

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText("Account Created Successfully!");
        myAlert.setContentText("User Id : ");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/system-admin-dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("System Admin DashBord!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}