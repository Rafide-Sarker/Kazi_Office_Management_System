package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

import static com.example.kazi_office_and_marriage_register_office.Methods.myAlert;

public class PersonalizationController
{

    @javafx.fxml.FXML
    private TextField nidNumberBrideTextField;
    @javafx.fxml.FXML
    private TextField motherNameBrideTextField;
    @javafx.fxml.FXML
    private DatePicker dateOfBirthBrideTextField;
    @javafx.fxml.FXML
    private TextField addressGroomTextField;
    @javafx.fxml.FXML
    private TextField phoneNumberGroomTextField;
    @javafx.fxml.FXML
    private DatePicker dateOfBirthGroomTextField;
    @javafx.fxml.FXML
    private TextField emailBrideTextField;
    @javafx.fxml.FXML
    private TextField fullNameBrideTextField;
    @javafx.fxml.FXML
    private TextField addressBrideTextField;
    @javafx.fxml.FXML
    private TextField fatherNameGroomTextField;
    @javafx.fxml.FXML
    private TextField fatherNameBrideTextField;
    @javafx.fxml.FXML
    private TextField phoneNumberBrideTextField;
    @javafx.fxml.FXML
    private TextField motherNameGroomTextField;
    @javafx.fxml.FXML
    private TextField emailGroomTextField;
    @javafx.fxml.FXML
    private TextField nidNumberGroomTextField;
    @javafx.fxml.FXML
    private TextField fullNameGroomTextField;
    @javafx.fxml.FXML
    private TextField witness1;
    @javafx.fxml.FXML
    private TextField witness2;

    @javafx.fxml.FXML

    public void initialize() {
    }

    @javafx.fxml.FXML
    public void nextAndGoToConfirmMarriagePageButtonOnAction(ActionEvent actionEvent) throws IOException {
        if (fullNameBrideTextField.getText().isEmpty() || fullNameGroomTextField.getText().isEmpty() || fatherNameBrideTextField.getText().isEmpty() || fatherNameGroomTextField.getText().isEmpty()|| motherNameBrideTextField.getText().isEmpty()||motherNameGroomTextField.getText().isEmpty()||
        addressBrideTextField.getText().isEmpty() || addressGroomTextField.getText().isEmpty() || dateOfBirthGroomTextField.getValue() == null || dateOfBirthBrideTextField.getValue() == null ||
        phoneNumberBrideTextField.getText().isEmpty() || phoneNumberGroomTextField.getText().isEmpty() || emailBrideTextField.getText().isEmpty() || emailGroomTextField.getText().isEmpty()){
            Methods.myAlert("Please fillup this option first");
            return;
        }
        if (!phoneNumberGroomTextField.getText().matches("\\d+")) {
            myAlert("Phone Number must be only Digits");
            return;
        }
        if (! phoneNumberBrideTextField.getText().matches("\\d+")){
            Methods.myAlert("Phone Number Must be Only Digits");
            return;
        }
        if (!emailGroomTextField.getText().contains("@") || !emailGroomTextField.getText().contains(".") || emailGroomTextField.getText().indexOf("@") > emailGroomTextField.getText().lastIndexOf(".")) {
            myAlert("Enter Valid Email");
            return;
        }
        if (!emailBrideTextField.getText().contains("@") || !emailBrideTextField.getText().contains(".") || emailBrideTextField.getText().indexOf("@") > emailBrideTextField.getText().lastIndexOf(".")) {
            myAlert("Enter Valid Email");
            return;
        }

        if (!nidNumberBrideTextField.getText().matches("\\d+")) {
            myAlert("NID Number Must be Only Digits");
            return;
        }
        if (!nidNumberGroomTextField.getText().matches("\\d+")){
            myAlert("NID Number Must be Only Digits");
            return;
        }

        MarriageApplication application = new MarriageApplication(

                MarriageApplication.generateApplicationID(),
                "Pending",
                LocalDate.now(),
                null,

                fullNameBrideTextField.getText(),
                fullNameGroomTextField.getText(),

                fatherNameGroomTextField.getText(),
                fatherNameBrideTextField.getText(),

                motherNameGroomTextField.getText(),
                motherNameBrideTextField.getText(),

                addressGroomTextField.getText(),
                addressBrideTextField.getText(),

                emailGroomTextField.getText(),
                emailBrideTextField.getText(),

                Integer.parseInt(nidNumberGroomTextField.getText()),
                Integer.parseInt(nidNumberBrideTextField.getText()),

                Integer.parseInt(phoneNumberBrideTextField.getText()),
                Integer.parseInt(phoneNumberGroomTextField.getText()),

                dateOfBirthGroomTextField.getValue(),
                dateOfBirthBrideTextField.getValue(),

                witness1.getText(),
                witness2.getText()
        );

        MarriageApplication.writeBinaryFile("MarriageApplication.bin", application);



        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/confirm-marriage-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Confirm Marriage!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToMarriageConsentPageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/marriageConsent-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Marriage Consent!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}