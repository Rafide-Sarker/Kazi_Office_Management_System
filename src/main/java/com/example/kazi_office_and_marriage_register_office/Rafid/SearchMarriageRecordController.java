package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class SearchMarriageRecordController {
    @javafx.fxml.FXML
    private BorderPane searchMarriageRecordsPane;
    @javafx.fxml.FXML
    private TextField rmsSearchGroomTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String > rmsCertificateNoTC;
    @javafx.fxml.FXML
    private TableView<MarriageCertificate> rmsMarriageRecordListTV;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> rmsBrideTC;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> rmsGroomTC;
    @javafx.fxml.FXML
    private TextField selectedCertificateNoTF;
    @javafx.fxml.FXML
    private TextField selectedStatusTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String > rmsDateTC;
    @javafx.fxml.FXML
    private TextField selectedMarriageRecordTF;
    @javafx.fxml.FXML
    private TextField selectedBrideNameTF;
    @javafx.fxml.FXML
    private TextField selectedMarriageDateTF;
    @javafx.fxml.FXML
    private TextField rmsSearchBrideTF;
    @javafx.fxml.FXML
    private TextField rmsSearchMarriageIdTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> rmsMarriageIdTC;
    @javafx.fxml.FXML
    private TextField selectedGroomNameTF;
    @javafx.fxml.FXML
    private DatePicker rmsSearchDateDatePicker;

    public void initialize(){
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        rmsMarriageIdTC.setCellValueFactory(new PropertyValueFactory<>("marriageId"));
        rmsDateTC.setCellValueFactory(new PropertyValueFactory<>("marriageDate"));
        rmsBrideTC.setCellValueFactory(new PropertyValueFactory<>("brideName"));
        rmsGroomTC.setCellValueFactory(new PropertyValueFactory<>("groomName"));
        rmsCertificateNoTC.setCellValueFactory(new PropertyValueFactory<>("certificateNo"));

        rmsMarriageRecordListTV.getItems().addAll(certificateList);

        rmsMarriageRecordListTV.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, selectedCertificate) ->{
                    if (selectedCertificate != null){
                        selectedMarriageRecordTF.setText(selectedCertificate.getMarriageId());
                        selectedBrideNameTF.setText(selectedCertificate.getBrideName());
                        selectedGroomNameTF.setText(selectedCertificate.getGroomName());
                        selectedCertificateNoTF.setText(selectedCertificate.getCertificateNo());
                        selectedMarriageDateTF.setText(String.valueOf(selectedCertificate.getMarriageDate()));
                        selectedStatusTF.setText(selectedCertificate.getStatus());
                    }
                }
        );
    }

    @javafx.fxml.FXML
    public void searchMarriageRecordFilterOnAction(ActionEvent actionEvent) {
        rmsMarriageRecordListTV.getItems().clear();
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("RegisteredMarriage.bin");

        boolean found = false;
        for (MarriageCertificate c: certificateList){

            if (c.getMarriageId().equals(rmsSearchMarriageIdTF.getText())){
                tableView(c);
                found = true;
            }
            if (c.getBrideName().equals(rmsSearchBrideTF.getText())){
                tableView(c);
                found = true;
            }
            if (c.getGroomName().equals(rmsSearchGroomTF.getText())){
                tableView(c);
                found = true;
            }
            if (c.getMarriageDate().equals(String.valueOf(rmsSearchDateDatePicker.getValue()))){
                tableView(c);
                found = true;
            }
        }
        if (!found){
            Methods.myAlert("Record Not Found");
        }
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
    public void clearMarriageRecordFilterOnAction(ActionEvent actionEvent) {
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        rmsSearchMarriageIdTF.clear();
        rmsSearchBrideTF.clear();
        rmsSearchGroomTF.clear();
        rmsSearchDateDatePicker.setValue(null);

        selectedMarriageRecordTF.clear();
        selectedBrideNameTF.clear();
        selectedGroomNameTF.clear();
        selectedCertificateNoTF.clear();
        selectedMarriageDateTF.clear();
        selectedStatusTF.clear();

        rmsMarriageRecordListTV.getItems().clear();
        rmsMarriageRecordListTV.getItems().addAll(certificateList);
    }

    public void tableView(MarriageCertificate certificate){
        rmsMarriageIdTC.setCellValueFactory(new PropertyValueFactory<>("marriageId"));
        rmsDateTC.setCellValueFactory(new PropertyValueFactory<>("marriageDate"));
        rmsBrideTC.setCellValueFactory(new PropertyValueFactory<>("brideName"));
        rmsGroomTC.setCellValueFactory(new PropertyValueFactory<>("groomName"));
        rmsCertificateNoTC.setCellValueFactory(new PropertyValueFactory<>("certificateNo"));

        rmsMarriageRecordListTV.getItems().addAll(certificate);
    }
}
