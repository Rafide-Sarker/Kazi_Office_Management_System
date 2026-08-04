package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateSystemReportController
{
    @javafx.fxml.FXML
    private TextArea reportPreviewTextArea;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private Label reportStatusLabel;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportReportButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backAndGoToDashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/system-admin-dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("System Admin Dashboard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}