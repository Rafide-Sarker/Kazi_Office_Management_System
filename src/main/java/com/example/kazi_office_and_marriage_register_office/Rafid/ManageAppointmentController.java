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

public class ManageAppointmentController {
    @javafx.fxml.FXML
    private BorderPane manageAppointmentPane;
    @javafx.fxml.FXML
    private TableColumn maDateTC;
    @javafx.fxml.FXML
    private TextField maContactNumberTextField;
    @javafx.fxml.FXML
    private TextField maAppointmentIdTextField;
    @javafx.fxml.FXML
    private TextField maDateTextField;
    @javafx.fxml.FXML
    private TableColumn maAppointmentIdTC;
    @javafx.fxml.FXML
    private DatePicker maSearchAppointmentDatePicker;
    @javafx.fxml.FXML
    private TextField maBrideNameTextField;
    @javafx.fxml.FXML
    private TableColumn maStatusTC;
    @javafx.fxml.FXML
    private TextField maTimeTextField;
    @javafx.fxml.FXML
    private TableColumn maGroomTC;
    @javafx.fxml.FXML
    private TextField maGroomNameTextField;
    @javafx.fxml.FXML
    private TableColumn maBrideTC;
    @javafx.fxml.FXML
    private TableColumn maTimeTC;
    @javafx.fxml.FXML
    private TextField maStatusTextField;
    @javafx.fxml.FXML
    private TableView maTableView;

    @javafx.fxml.FXML
    public void cancelButtonOnAction(ActionEvent actionEvent) {
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
    public void FilterSearchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void conFirmButtonOnAction(ActionEvent actionEvent) {
    }
}
