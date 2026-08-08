package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateMonthleyReport {
    @javafx.fxml.FXML
    private ComboBox yearComboBox;
    @javafx.fxml.FXML
    private TextField monthTF;
    @javafx.fxml.FXML
    private TextField yearTF;
    @javafx.fxml.FXML
    private ComboBox monthComboBox;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TextField totalRevenueTF;
    @javafx.fxml.FXML
    private TextField netIncomeTF;
    @javafx.fxml.FXML
    private TextField totalPaymentTF;
    @javafx.fxml.FXML
    private TextField totalRefundTF;

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @Deprecated
    public void generateReport(ActionEvent actionEvent) {
    }

    @Deprecated
    public void BackAndGoToDashboardButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
    }
}
