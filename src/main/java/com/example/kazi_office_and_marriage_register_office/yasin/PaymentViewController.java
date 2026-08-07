package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class PaymentViewController
{
    @javafx.fxml.FXML
    private Label registrationFeeLabel;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private TextField mobileNumberTextField;
    private MarriageApplication application;


    @javafx.fxml.FXML
    public void initialize() {
        registrationFeeLabel.setText("1000");

        paymentMethodComboBox.getItems().addAll(
                "bkash",
                "Nagad",
                "Rocket");

        application = MarriageApplication.searchApplicationByUser(
                "MarriageApplication.bin",
                User.currentUser.getEmail()
        );
    }



    @javafx.fxml.FXML
    public void payAndGoToDashBoard(ActionEvent actionEvent) throws IOException {

        if (paymentMethodComboBox.getValue() == null ||
                mobileNumberTextField.getText().isEmpty()) {

            Methods.myAlert("Please fill up all fields.");
            return;
        }

        if (!mobileNumberTextField.getText().matches("\\d+")) {
            Methods.myAlert("Mobile number must contain only digits.");
            return;
        }


        String paymentId = Payment.generatePaymentId();

        Payment oldPayment = Payment.searchPaymentByApplicationId(
                "Payment.bin",
                application.getApplicationID()
        );

        if (oldPayment != null) {
            Methods.myAlert("Payment Already Completed");
            return;
        }


        Payment payment = new Payment(
                paymentId,
                1000,
                paymentMethodComboBox.getValue(),
                "Paid",
                mobileNumberTextField.getText(),
                application.getApplicationID()
        );

        String TransactionId = Payment.generateTransactionId();

        String receiptId = Receipt.generateReceiptID();

        Receipt receipt = new Receipt(
                receiptId,
                LocalDate.now(),
                1000,
                paymentMethodComboBox.getValue(),
                "Paid"
        );
        payment.setReceipt(receipt);  // for composition

        Payment.savePaymentBinaryFile("Payment.bin",payment);


        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Payment Successful");
        myAlert.setHeaderText(" Registration Fee Paid Successfully!");
        myAlert.setContentText("Receipt No:"+receiptId +"\n"+"Transaction Id :" + TransactionId);
        myAlert.showAndWait();

        paymentMethodComboBox.getSelectionModel().clearSelection();
        mobileNumberTextField.clear();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoard(ActionEvent actionEvent)  throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}