package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgetPasswordController {
    @javafx.fxml.FXML
    private Label Hudai;

    @javafx.fxml.FXML
    public void backToLoginPageOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Login Page");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void sendVerificationCodeOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("set-password-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Set Password Page");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
