package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateNewAccountController {
    @Deprecated
    public void createNewAccountOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backToLoginPageOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Login Page");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
