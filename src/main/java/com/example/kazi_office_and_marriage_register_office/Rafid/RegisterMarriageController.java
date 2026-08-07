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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class RegisterMarriageController {
    @javafx.fxml.FXML
    private BorderPane RegisterMarriagePane;
    @javafx.fxml.FXML
    private TextField rmMarriageIdTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> rmMarriageIdTC;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> rmCertificateNoTC;
    @javafx.fxml.FXML
    private TextField searchApproveMarriageFIlterTF;
    @javafx.fxml.FXML
    private TextField rmCertificateNumberTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> rmGroomTC;
    @javafx.fxml.FXML
    private TextField rmBrideNameTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, LocalDate> rmDateTC;
    @javafx.fxml.FXML
    private TextField rmGroomNameTF;
    @javafx.fxml.FXML
    private DatePicker rmMarriageDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String > rmBrideTC;
    @javafx.fxml.FXML
    private TableView<MarriageCertificate> rmApprovedMarriageTV;

    public void initialize(){
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        rmMarriageIdTC.setCellValueFactory(new PropertyValueFactory<>("marriageId"));
        rmDateTC.setCellValueFactory(new PropertyValueFactory<>("marriageDate"));
        rmBrideTC.setCellValueFactory(new PropertyValueFactory<>("brideName"));
        rmGroomTC.setCellValueFactory(new PropertyValueFactory<>("groomName"));
        rmCertificateNoTC.setCellValueFactory(new PropertyValueFactory<>("certificateNo"));

        rmApprovedMarriageTV.getItems().addAll(certificateList);

        rmApprovedMarriageTV.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, selectedCertificate) ->{
                    if (selectedCertificate!=null){
                        rmMarriageIdTF.setText(selectedCertificate.getMarriageId());
                        rmBrideNameTF.setText(selectedCertificate.getBrideName());
                        rmGroomNameTF.setText(selectedCertificate.getGroomName());
                        rmMarriageDateDatePicker.setValue(selectedCertificate.getMarriageDate());
                        rmCertificateNumberTF.setText(selectedCertificate.getCertificateNo());
                    }
                }
        );
    }

    @javafx.fxml.FXML
    public void registerMarriageOnAction(ActionEvent actionEvent) {
        MarriageCertificate certificate =
                rmApprovedMarriageTV.getSelectionModel().getSelectedItem();

        if (certificate == null) {
            Methods.myAlert("Please select a marriage.");
            return;
        }

        ArrayList<MarriageCertificate> registeredList = Methods.readCertificateBinaryFile("RegisteredMarriage.bin");

        for (MarriageCertificate c : registeredList) {
            if (c.getMarriageId().equals(certificate.getMarriageId())) {
                Methods.myAlert("Marriage already registered.");
                return;
            }
        }
        certificate.setStatus("Registered");
        Methods.writeCertificateBinaryFile("RegisteredMarriage.bin", certificate);

        Methods.Alert("Marriage registered successfully.");
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
    public void searchApprovedMarriageFilterOnAction(ActionEvent actionEvent) {
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        rmApprovedMarriageTV.getItems().clear();

        String marriageId = searchApproveMarriageFIlterTF.getText().trim();

        for (MarriageCertificate c : certificateList) {
            if (c.getMarriageId().equalsIgnoreCase(marriageId)) {
                rmApprovedMarriageTV.getItems().add(c);
            }
        }

        if (rmApprovedMarriageTV.getItems().isEmpty()) {
            Methods.myAlert("No marriage found.");
        }
    }

    @javafx.fxml.FXML
    public void ClearOnAction(ActionEvent actionEvent) {
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        searchApproveMarriageFIlterTF.clear();
        rmApprovedMarriageTV.getItems().clear();
        rmApprovedMarriageTV.getItems().addAll(certificateList);
    }
}
