package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.Documents;
import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import com.example.kazi_office_and_marriage_register_office.appendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class UploadDocumentsController
{
    @javafx.fxml.FXML
    private TextField bridePhotoTextField;
    @javafx.fxml.FXML
    private TextField GroomnNidCopyTextField;
    @javafx.fxml.FXML
    private TextField GroomPhotoTextField;
    @javafx.fxml.FXML
    private TextField brideNidCopyTextField;
    @javafx.fxml.FXML
    private TextField brideDobCertificateTextField;
    @javafx.fxml.FXML
    private TextField groomDobCertificateTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void chooseBridePhotoButtonOnAction(ActionEvent actionEvent) {
        bridePhotoTextField.setText("Bride choose photo");
    }

    @javafx.fxml.FXML
    public void chooseBrideNidCopyButtonOnAction(ActionEvent actionEvent) {
        brideNidCopyTextField.setText("Bride Choose NID copy");
    }

    @javafx.fxml.FXML
    public void chooseBrideDobCertificateButtonOnAction(ActionEvent actionEvent) {
        brideDobCertificateTextField.setText("Bride choose DOB certificates");
    }

    @javafx.fxml.FXML
    public void chooseGroomNidCopyButtonOnAction(ActionEvent actionEvent) {
        GroomnNidCopyTextField.setText("Groom choose NID copy");
    }

    @javafx.fxml.FXML
    public void chooseGroomDobCertificateButtonOnAction(ActionEvent actionEvent) {
        groomDobCertificateTextField.setText("Groom choose DOB certificates");
    }

    @javafx.fxml.FXML
    public void chooseGroomPhotoButtonOnAction(ActionEvent actionEvent) {
        GroomPhotoTextField.setText("Groom choose photo");
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


    @javafx.fxml.FXML
    public void uploadAndGoToDashBoardOnAction(ActionEvent actionEvent) throws IOException {

        if(brideDobCertificateTextField.getText().isEmpty()){
            Methods.myAlert("Please choose Bride DOB Certificate");
            return;
        }
        if(bridePhotoTextField.getText().isEmpty()){
            Methods.myAlert("Please choose Bride Photo");
            return;
        }
        if (brideNidCopyTextField.getText().isEmpty()) {
            Methods.myAlert("Please choose Bride NID Copy");
            return;
        }

        if (GroomPhotoTextField.getText().isEmpty()) {
            Methods.myAlert("Please choose Groom Photo");
            return;
        }

        if (groomDobCertificateTextField.getText().isEmpty()) {
            Methods.myAlert("Please choose Groom DOB Certificate");
            return;
        }

        if (GroomnNidCopyTextField.getText().isEmpty()) {
            Methods.myAlert("Please choose Groom NID Copy");
            return;
        }

        Documents documents = new Documents(

                bridePhotoTextField.getText(),
                brideDobCertificateTextField.getText(),
                brideNidCopyTextField.getText(),

                GroomPhotoTextField.getText(),
                groomDobCertificateTextField.getText(),
                GroomnNidCopyTextField.getText(),

                Documents.generateDocumentsID(),
                "Marriage Documents",
                LocalDate.now(),
                "Pending"
        );

        Documents.writeBinaryFile("Documents.bin", documents);

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(" Documents Uploaded Successfully!");
        myAlert.setContentText("Documents ID :" + Documents.generateDocumentsID());
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();

    }
}