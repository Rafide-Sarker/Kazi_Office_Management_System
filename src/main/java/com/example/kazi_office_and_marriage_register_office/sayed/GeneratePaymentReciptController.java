package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneratePaymentReciptController {
    @javafx.fxml.FXML
    private TextField reciptIdTF;
    @javafx.fxml.FXML
    private DatePicker paymentDateDatePicker;
    @javafx.fxml.FXML
    private TextField marriageIdTF;
    @javafx.fxml.FXML
    private TextField brideNameTF;
    @javafx.fxml.FXML
    private TextField paymentIdTF;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TextField groomNameTF;
    @javafx.fxml.FXML
    private TextField amountTF;

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
    public void BackAndGoToDashboardButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generatePaymentButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void BackButtonOnAction(ActionEvent actionEvent) {
    }
}
