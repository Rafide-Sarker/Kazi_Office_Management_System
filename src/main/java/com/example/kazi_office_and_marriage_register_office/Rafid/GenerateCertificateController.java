package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
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
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class GenerateCertificateController{
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

    private MarriageApplication application;


    public void initialize(){
        application = ReviewApplicationController.getSelectedApplication();

        if (application == null){
            Methods.myAlert("Selected Application does not exist");
            return;
        }


        gmcBrideNameTextField.setText(application.getFullNameBride());
        gmcGroomNameTextField.setText(application.getFullNameGroom());
        gmcBrideNidTextField.setText(String.valueOf(application.getNidBride()));
        gmcGroomNidTextField.setText(String.valueOf(application.getNidGroom()));
        gmcBrideAddressTextField.setText(application.getAddressBride());
        gmcGroomAddressTextField.setText(application.getAddressGroom());
        gmcWitness1TextField.setText(application.getWitness1());
        gmcWitness2TextField.setText(application.getWitness2());
        gmcBrideDobdatePicker.setValue(application.getDobBride());
        gmcDobDatePicker.setValue(application.getDobGroom());
        gmcMarriageDateDatePicker.setValue(LocalDate.now());
        gmcRegistrationNoTextField.setText("REG-" + String.valueOf(LocalDate.now()));
        gmcCertificateNoTextField.setText("CER-" + String.valueOf(LocalDate.now()));
        gmcMarriageIdTextField.setText(application.getApplicationID());
    }


    @javafx.fxml.FXML
    public void GenerateCertificate(ActionEvent actionEvent) {
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        if (gmcRegisteredByTextField.getText().isBlank()) {
            Methods.myAlert("Please enter Registered By.");
            return;
        }
        for (MarriageCertificate c : certificateList) {
            if (c.getMarriageId().equals(application.getApplicationID())) {
                Methods.myAlert("Certificate Already Exists for this Marriage");
                return;
            }
        }

        MarriageCertificate certificate = new MarriageCertificate(
                gmcCertificateNoTextField.getText(),
                gmcRegistrationNoTextField.getText(),
                application.getApplicationID(),
                application,
                gmcRegisteredByTextField.getText(),
                gmcMarriageDateDatePicker.getValue()
        );
        Methods.writeCertificateBinaryFile("MarriageCertificateList.bin", certificate);
        Methods.Alert("Certificate generated successfully.");
    }

    @javafx.fxml.FXML
    public void BackFromOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/kazi-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
