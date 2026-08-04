package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistryManagementController {

    @javafx.fxml.FXML
    private BorderPane registryManagementPane;
    @javafx.fxml.FXML
    private TextField remMarriageIdTF;
    @javafx.fxml.FXML
    private TextField remAddressTF;
    @javafx.fxml.FXML
    private TableColumn remBrideTC;
    @javafx.fxml.FXML
    private TableView remRegisteredMarriageRecordTV;
    @javafx.fxml.FXML
    private TextField searchMarriageIdTF;
    @javafx.fxml.FXML
    private TextField remRegistrationNoTF;
    @javafx.fxml.FXML
    private TableColumn remGroomTC;
    @javafx.fxml.FXML
    private TextField remGroomNameTF;
    @javafx.fxml.FXML
    private TableColumn remStatusTC;
    @javafx.fxml.FXML
    private TextField remContactNumberTF;
    @javafx.fxml.FXML
    private ComboBox remStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn remRegistrationIDTC;
    @javafx.fxml.FXML
    private TextField remBrideNameTF;

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/registrar-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }


    @javafx.fxml.FXML
    public void searchRegisteredMarriageFilterOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void issueDuplicateOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void verifyCertificateOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateMarriageRegistryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void archiveMarriageRegistryOnAction(ActionEvent actionEvent) {
    }
}
