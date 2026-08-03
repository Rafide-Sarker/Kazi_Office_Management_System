package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonalizationController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField fatherNameTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private TextField nidNumberTextField;
    @javafx.fxml.FXML
    private TextField motherNameTextField;
    @javafx.fxml.FXML
    private DatePicker dateOfBirthTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void nextAndGoToConfirmMarriagePageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/confirm-marriage-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Confirm Marriage!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToMarriageConsentPageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/marriageConsent-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("Marriage Consent!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}