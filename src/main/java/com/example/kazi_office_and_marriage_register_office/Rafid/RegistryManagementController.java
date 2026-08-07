package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class RegistryManagementController {

    @javafx.fxml.FXML
    private BorderPane registryManagementPane;
    @javafx.fxml.FXML
    private TextField remMarriageIdTF;
    @javafx.fxml.FXML
    private TextField remAddressTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> remBrideTC;
    @javafx.fxml.FXML
    private TableView<MarriageCertificate> remRegisteredMarriageRecordTV;
    @javafx.fxml.FXML
    private TextField searchMarriageIdTF;
    @javafx.fxml.FXML
    private TextField remRegistrationNoTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> remGroomTC;
    @javafx.fxml.FXML
    private TextField remGroomNameTF;
    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> remRegistrationIDTC;
    @javafx.fxml.FXML
    private TextField remBrideNameTF;

    @javafx.fxml.FXML
    private TableColumn<MarriageCertificate, String> remMarriageIDTC;

    private ArrayList<MarriageCertificate> registeredMarriageList;


    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/registrar-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }

    public void initialize(){
        registeredMarriageList = Methods.readCertificateBinaryFile("RegisteredMarriage.bin");

        remRegistrationIDTC.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        remBrideTC.setCellValueFactory(new PropertyValueFactory<>("brideName"));
        remGroomTC.setCellValueFactory(new PropertyValueFactory<>("groomName"));
        remMarriageIDTC.setCellValueFactory(new PropertyValueFactory<>("marriageId"));

        remRegisteredMarriageRecordTV.getItems().addAll(registeredMarriageList);

        remRegisteredMarriageRecordTV.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, selectedValue)->{
                    if (selectedValue == null){
                        return;
                    }
                    remRegistrationNoTF.setText(selectedValue.getRegistrationNo());
                    remMarriageIdTF.setText(selectedValue.getMarriageId());
                    remBrideNameTF.setText(selectedValue.getBrideName());
                    remGroomNameTF.setText(selectedValue.getGroomName());
                    remAddressTF.setText(selectedValue.getGroomAddress());
                }
        );
    }



    @javafx.fxml.FXML
    public void searchRegisteredMarriageFilterOnAction(ActionEvent actionEvent) {
        String searchId = searchMarriageIdTF.getText().trim();

        for (MarriageCertificate c: registeredMarriageList){
            if (c.getMarriageId().equals(searchId)){
                remRegisteredMarriageRecordTV.getItems().clear();
                remRegisteredMarriageRecordTV.getItems().add(c);
                return;
            }
        }
        Methods.myAlert("Marriage Id was not found");
    }



    @javafx.fxml.FXML
    public void UpdateAndArchiveMarriageRegistryOnAction(ActionEvent actionEvent) {
        MarriageCertificate selectedCertificate = remRegisteredMarriageRecordTV.getSelectionModel().getSelectedItem();

        if (selectedCertificate == null){
            Methods.myAlert("Select Marriage Record First");
            return;
        }
        selectedCertificate.setBrideName(remBrideNameTF.getText());
        selectedCertificate.setGroomName(remGroomNameTF.getText());
        selectedCertificate.setGroomAddress(remAddressTF.getText());

        Methods.rewriteCertificateBinaryFile("RegisteredMarriage.bin", registeredMarriageList);

        remRegisteredMarriageRecordTV.refresh();
        Methods.Alert("Marriage Record Updated and Archived SuccessFully");
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
        ArrayList<MarriageCertificate> certificateList = Methods.readCertificateBinaryFile("MarriageCertificateList.bin");

        searchMarriageIdTF.clear();
        remRegisteredMarriageRecordTV.getItems().clear();
        remRegisteredMarriageRecordTV.getItems().addAll(certificateList);
    }
}
