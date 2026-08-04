package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateCertificateController {
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private BorderPane generateMarriageCertificatePane;
    @javafx.fxml.FXML
    private TextField gmcWitness1TextField;
    @javafx.fxml.FXML
    private TextField gmcCertificateNoTextField;
    @javafx.fxml.FXML
    private TextField gmcGroomNidTextField;
    @javafx.fxml.FXML
    private TextField gmcRegistrationNoTextField;
    @javafx.fxml.FXML
    private TextField gmcBrideNameTextField;
    @javafx.fxml.FXML
    private DatePicker gmcBrideDobdatePicker;
    @javafx.fxml.FXML
    private TextField gmcBrideAddressTextField;
    @javafx.fxml.FXML
    private TextField gmcGroomNameTextField;
    @javafx.fxml.FXML
    private TextField gmcRegisteredByTextField;
    @javafx.fxml.FXML
    private TextField gmcWitness2TextField;
    @javafx.fxml.FXML
    private TextField gmcGroomAddressTextField;
    @javafx.fxml.FXML
    private TextField gmcBrideNidTextField;
    @javafx.fxml.FXML
    private DatePicker gmcMarriageDateDatePicker;
    @javafx.fxml.FXML
    private DatePicker gmcDobDatePicker;
    @javafx.fxml.FXML
    private TextField gmcMarriageIdTextField;


    @javafx.fxml.FXML
    public void GenerateCertificate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackFromOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/registrar-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
