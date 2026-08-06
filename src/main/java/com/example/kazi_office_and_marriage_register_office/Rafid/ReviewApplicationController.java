package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReviewApplicationController {
    @javafx.fxml.FXML
    private BorderPane reviewApplicationBorderPane;
    @javafx.fxml.FXML
    private CheckBox verifyBrideCheckBox;
    @javafx.fxml.FXML
    private TextField raGroomNidTF;
    @javafx.fxml.FXML
    private TextField raBrideAddressTF;
    @javafx.fxml.FXML
    private TextField raGroomAddressTF;
    @javafx.fxml.FXML
    private TextField raGroomPhoneTF;
    @javafx.fxml.FXML
    private ComboBox<String> raSearchStatusComboBox;
    @javafx.fxml.FXML
    private TextField raBridePhoneTF;
    @javafx.fxml.FXML
    private TextField raBrideNIDTF;
    @javafx.fxml.FXML
    private TextField raBrideDOBTF;
    @javafx.fxml.FXML
    private TextField raApplicationIdTF;
    @javafx.fxml.FXML
    private TextField raSearchBrideNameTF;
    @javafx.fxml.FXML
    private CheckBox verifyGroomCheckBox;
    @javafx.fxml.FXML
    private TextField raGroomNameTF;
    @javafx.fxml.FXML
    private TextField raGroomDobTF;
    @javafx.fxml.FXML
    private TextField raSearchGroomNameTF;
    @javafx.fxml.FXML
    private ListView<File> raUploadedDocumentListView;
    @javafx.fxml.FXML
    private TextField raWitness2TF;
    @javafx.fxml.FXML
    private TextField raWitness1TF;
    @javafx.fxml.FXML
    private TextField raBrideNameTF;

    private static MarriageApplication selectedApplication;
    @javafx.fxml.FXML
    private DatePicker raApplicationDateDatePicker;
    @javafx.fxml.FXML
    private Button approveMarriageButton;
    @javafx.fxml.FXML
    private Button generateCertificateButton;

    public static MarriageApplication getSelectedApplication() {
        return selectedApplication;
    }

    public void initialize(){
        raSearchStatusComboBox.getItems().addAll("Pending", "Approved", "Rejected");
    }

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/kazi-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void approveMarriageOnAction(ActionEvent actionEvent) {
        if (selectedApplication == null) {
            Methods.myAlert("Please search an application first.");
            return;
        }
        if (!selectedApplication.getStatus().equals("Pending")) {
            Methods.myAlert("This application has already been processed.");
            return;
        }
        ArrayList<MarriageApplication> applicationList = Methods.readBinaryFile("SavedApplications.bin");

        for (MarriageApplication app: applicationList){
            if (app.getApplicationID().equals(selectedApplication.getApplicationID())){
                app.setStatus("Approved");
                break;
            }

        }
        Methods.rewriteBinaryFile("SavedApplications.bin", applicationList);

        selectedApplication.setStatus("Approved");
        raSearchStatusComboBox.setValue("Approved");

        Methods.myAlert("Marriage Approved Successfully");

    }

    @javafx.fxml.FXML
    public void rejectMarriageOnAction(ActionEvent actionEvent) {
        if (selectedApplication == null) {
            Methods.myAlert("Please search an application first.");
            return;
        }
        if (!selectedApplication.getStatus().equals("Pending")) {
            Methods.Alert("This application has already been processed.");
            return;
        }
        ArrayList<MarriageApplication> applicationList = Methods.readBinaryFile("SavedApplications.bin");

        for (MarriageApplication app: applicationList){
            if (app.getApplicationID().equals(selectedApplication.getApplicationID())){
                app.setStatus("Rejected");
                break;
            }

        }
        Methods.rewriteBinaryFile("SavedApplications.bin", applicationList);

        selectedApplication.setStatus("Rejected");
        raSearchStatusComboBox.setValue("Rejected");

        Methods.Alert("Marriage Rejected Successfully");
    }

    @javafx.fxml.FXML
    public void generateCirtificateOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/generate-certificate-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void searchReviewApplicationOnAction(ActionEvent actionEvent) {
        ArrayList<MarriageApplication> applicationList = Methods.readBinaryFile("SavedApplications.bin");

        boolean found = false;
        if (raApplicationIdTF.getText().isEmpty()
                && raSearchBrideNameTF.getText().isEmpty()
                && raSearchGroomNameTF.getText().isEmpty()
                && raSearchStatusComboBox.getValue() == null) {

            Methods.myAlert("Please enter at least one search field.");
            return;
        }

        for (MarriageApplication app: applicationList){
            boolean match = true;

            if (!raApplicationIdTF.getText().isEmpty() && !app.getApplicationID().equals(raApplicationIdTF.getText())){
                match = false;
            }
            if (!raSearchBrideNameTF.getText().isEmpty() && !app.getFullNameBride().equals(raSearchBrideNameTF.getText())){
                match = false;
            }
            if (!raSearchGroomNameTF.getText().isEmpty() && !app.getFullNameGroom().equals(raSearchGroomNameTF.getText())){
                match = false;
            }
            if (raSearchStatusComboBox.getValue() != null && !app.getStatus().equals(raSearchStatusComboBox.getValue())){
                match = false;
            }

            if (match){
                // left panel
                raApplicationIdTF.setText(app.getApplicationID());
                raSearchGroomNameTF.setText(app.getFullNameGroom());
                raSearchBrideNameTF.setText(app.getFullNameBride());
                raSearchStatusComboBox.setValue(app.getStatus());

                // right panel
                raBrideNameTF.setText((app.getFullNameBride()));
                raGroomNameTF.setText((app.getFullNameGroom()));
                raBrideDOBTF.setText(String.valueOf(app.getDobBride()));
                raGroomDobTF.setText(String.valueOf(app.getDobGroom()));
                raBrideNIDTF.setText(String.valueOf(app.getNidBride()));
                raGroomNidTF.setText(String.valueOf(app.getNidGroom()));
                raBridePhoneTF.setText(String.valueOf(app.getPhoneNumberBride()));
                raGroomPhoneTF.setText(String.valueOf(app.getPhoneNumberGroom()));
                raBrideAddressTF.setText(app.getAddressBride());
                raGroomAddressTF.setText(app.getAddressGroom());
                raWitness1TF.setText(app.getWitness1());
                raWitness2TF.setText(app.getWitness2());

                selectedApplication = app;

                found = true;
                break;
            }

        }
        if (!found){
            Methods.myAlert("Application not found");
        }
    }

    @javafx.fxml.FXML
    public void clearSearchReviewApplicationOnAction(ActionEvent actionEvent) {
        // Left panel
        raApplicationIdTF.clear();
        raSearchBrideNameTF.clear();
        raSearchGroomNameTF.clear();
        raSearchStatusComboBox.getSelectionModel().clearSelection();

        // Right panel
        raBrideNameTF.clear();
        raGroomNameTF.clear();
        raBrideDOBTF.clear();
        raGroomDobTF.clear();
        raBrideNIDTF.clear();
        raGroomNidTF.clear();
        raBridePhoneTF.clear();
        raGroomPhoneTF.clear();
        raBrideAddressTF.clear();
        raGroomAddressTF.clear();
        raWitness1TF.clear();
        raWitness2TF.clear();
        verifyBrideCheckBox.setSelected(false);
        verifyGroomCheckBox.setSelected(false);
        raUploadedDocumentListView.getItems().clear();
    }

    @FXML
    public void verifyCheckBoxOnAction(ActionEvent actionEvent) {
        boolean enable = (verifyBrideCheckBox.isSelected() && verifyGroomCheckBox.isSelected());

        approveMarriageButton.setDisable(!enable);
        generateCertificateButton.setDisable(!enable);
    }

}
