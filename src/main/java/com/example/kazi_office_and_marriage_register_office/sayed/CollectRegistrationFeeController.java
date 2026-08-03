package com.example.kazi_office_and_marriage_register_office.sayed;

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

public class CollectRegistrationFeeController
{
    @javafx.fxml.FXML
    private TextField applicationIdTextField;
    @javafx.fxml.FXML
    private TextField transactionIdTextField;
    @javafx.fxml.FXML
    private Label applicantNameLabel;
    @javafx.fxml.FXML
    private Label registrationFeeLabel;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void completePaymentButtonOnAction(ActionEvent actionEvent)throws IOException {
        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText("Payment Completed Successfully!");
        myAlert.setContentText("Receipt No: ");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}