package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfirmMarriageController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmAndGoToReviewApplicationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/review-application-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Review Application!");
        nextStage.setScene(scene);
        nextStage.show();
    }
    @javafx.fxml.FXML
    public void backAndGoToPersonalInformationPageButtonOnActon(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/personal-information-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("Personal Information!");
        nextStage.setScene(scene);
        nextStage.show();
    }

}