package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import com.example.kazi_office_and_marriage_register_office.Payment;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DownloadCertificateController
{

    @javafx.fxml.FXML
    private TextField downloadPdfStatusTextFiled;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadPdfAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {

        MarriageApplication application =
                MarriageApplication.readApplication("MarriageApplication.bin");

        Payment payment = Payment.readPayment("Payment.bin");
        if(payment == null || !"Paid".equals(payment.getPaymentStatus())){
            Methods.myAlert("Please complete the registration fee payment first.");
            return;
        }

        if (application == null) {
            Methods.myAlert("No application found.");
            return;
        }

        if (!"Approved".equals(application.getStatus())) {
            downloadPdfStatusTextFiled.setText("Not Approved");
            Methods.myAlert("Marriage is not approved yet.");
            return;
        }

        downloadPdfStatusTextFiled.setText("Download Successful");

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(null);
        myAlert.setContentText("Certificate downloaded successfully");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}