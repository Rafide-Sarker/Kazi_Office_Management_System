package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentViewController
{
    @javafx.fxml.FXML
    private TextField transactionIdTextField;
    @javafx.fxml.FXML
    private Label registrationFeeLabel;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TextField mobileNumberTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payAndGoToDashBoard(ActionEvent actionEvent) throws IOException {

        // Receipt number code

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Payment Successful");
        myAlert.setHeaderText(" Registration Fee Paid Successfully!");
        myAlert.setContentText("Receipt No:");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoard(ActionEvent actionEvent)  throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}