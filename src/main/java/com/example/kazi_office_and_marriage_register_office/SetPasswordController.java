package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SetPasswordController {
    @javafx.fxml.FXML
    private Button resetPassword;

    @javafx.fxml.FXML
    public void resetPasswordOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToLoginPageOnAction(ActionEvent actionEvent) throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Login Page");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
