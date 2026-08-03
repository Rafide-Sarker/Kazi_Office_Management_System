package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController
{
    @javafx.fxml.FXML
    private BorderPane borderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateDailyReportButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/generate-daily-report-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void generateMonthlyReportButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/generate-monthly-report-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void SearchPaymentRecordsButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/search-payment-record-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void collectRegistrationFeeButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/collect-registration-fee-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());

    }

    @javafx.fxml.FXML
    public void verifyPaymentTransactionButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/verify-payment-transaction-view.fxml"));
        borderPane.setCenter(fxmlLoader.load());

    }

    @javafx.fxml.FXML
    public void processRefundRequestButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/proccess-refund-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void generatePaymentReceiptButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/generate-payment-recipt-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void exportFinancialReportButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/export-financial-report.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}