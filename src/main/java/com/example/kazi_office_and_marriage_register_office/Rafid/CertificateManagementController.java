package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CertificateManagementController {
    @javafx.fxml.FXML
    private BorderPane certificateManagementPane;
    @javafx.fxml.FXML
    private TableColumn cmBrideTableColumn;
    @javafx.fxml.FXML
    private TableView CertificateManagementTableView;
    @javafx.fxml.FXML
    private TableColumn cmGroomTableColumn;
    @javafx.fxml.FXML
    private TextField cmBrideNameTextField;
    @javafx.fxml.FXML
    private TableColumn cmStatusTableColumn;
    @javafx.fxml.FXML
    private TextField cmRegistrationNoTextField;
    @javafx.fxml.FXML
    private TextField cmSearchCertificateNoTextField;
    @javafx.fxml.FXML
    private TextField cmStatusTextField;
    @javafx.fxml.FXML
    private TextField cmCertificateNoTextField;
    @javafx.fxml.FXML
    private TableColumn cmCertificateNoTableColumn;
    @javafx.fxml.FXML
    private TextField cmGroomNameTextField;
    @javafx.fxml.FXML
    private TextField cmMarriageIdTextField;
    @javafx.fxml.FXML
    private DatePicker cmIssueDateDatePicker;

    @javafx.fxml.FXML
    public void issueDuplicateOnAction(ActionEvent actionEvent) throws IOException {

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
    public void verifyCertificateOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void searchRegisteredMarriageFilterOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchRegisteredMarriageOnAction(ActionEvent actionEvent) {
    }
}
