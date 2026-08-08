package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class CertificateManagementController {

    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> cmBrideTableColumn;
    @javafx.fxml.FXML
    private TableView<MarriageCertificate> CertificateManagementTableView;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> cmGroomTableColumn;
    @javafx.fxml.FXML
    private TextField cmBrideNameTextField;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> cmStatusTableColumn;
    @javafx.fxml.FXML
    private TextField cmRegistrationNoTextField;
    @javafx.fxml.FXML
    private TextField cmSearchCertificateNoTextField;
    @javafx.fxml.FXML
    private TextField cmCertificateNoTextField;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> cmCertificateNoTableColumn;
    @javafx.fxml.FXML
    private TextField cmGroomNameTextField;
    @javafx.fxml.FXML
    private TextField cmMarriageIdTextField;
    @javafx.fxml.FXML
    private DatePicker cmIssueDateDatePicker;
    private ArrayList<MarriageCertificate> certificateList;
    public void initialize(){

        certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        cmCertificateNoTableColumn.setCellValueFactory(new PropertyValueFactory<>("certificateNo"));
        cmBrideTableColumn.setCellValueFactory(new PropertyValueFactory<>("brideName"));
        cmGroomTableColumn.setCellValueFactory(new PropertyValueFactory<>("groomName"));
        cmStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("marriageDate"));

        CertificateManagementTableView.getItems().addAll(certificateList);

        CertificateManagementTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, selected)->{
                    if (selected == null){
                        return;
                    }
                    cmCertificateNoTextField.setText(selected.getCertificateNo());
                    cmMarriageIdTextField.setText(selected.getMarriageId());
                    cmRegistrationNoTextField.setText(selected.getRegistrationNo());
                    cmBrideNameTextField.setText(selected.getBrideName());
                    cmGroomNameTextField.setText(selected.getGroomName());
                    cmIssueDateDatePicker.setValue(selected.getMarriageDate());
                }
        );
    }

    @javafx.fxml.FXML
    public void issueDuplicateOnAction(){
        if (!cmCertificateNoTextField.getText().isEmpty() && cmIssueDateDatePicker.getValue() != null && !cmMarriageIdTextField.getText().isEmpty() &&!cmRegistrationNoTextField.getText().isEmpty() && !cmBrideNameTextField.getText().isEmpty() && !cmGroomNameTextField.getText().isEmpty()){
            Methods.Alert("Duplicate Certificate Issued Successfully.");
        }
    }

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/registrar-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void verifyCertificateOnAction() {
        if (!cmCertificateNoTextField.getText().isEmpty() && cmIssueDateDatePicker.getValue() != null && !cmMarriageIdTextField.getText().isEmpty() &&!cmRegistrationNoTextField.getText().isEmpty() && !cmBrideNameTextField.getText().isEmpty() && !cmGroomNameTextField.getText().isEmpty()){
            Methods.Alert("Certificate Verified Successfully.");
        }

    }

    @javafx.fxml.FXML
    public void searchRegisteredMarriageOnAction() {
        for (MarriageCertificate c: certificateList){
            if (c.getCertificateNo().equals(cmSearchCertificateNoTextField.getText())){
                CertificateManagementTableView.getItems().clear();
                CertificateManagementTableView.getItems().setAll(c);
                return;
            }
        }
        Methods.myAlert("Certificate does not exist");
    }

    @javafx.fxml.FXML
    public void ClearOnAction() {
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        cmSearchCertificateNoTextField.clear();
        CertificateManagementTableView.getItems().clear();
        CertificateManagementTableView.getItems().addAll(certificateList);
    }
}
