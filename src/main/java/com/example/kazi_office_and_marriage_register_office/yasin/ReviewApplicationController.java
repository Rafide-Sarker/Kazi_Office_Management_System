package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.appendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReviewApplicationController
{

    @javafx.fxml.FXML
    private Label motherNameBrideLabelField;
    @javafx.fxml.FXML
    private Label fatherNameBrideLabelField;
    @javafx.fxml.FXML
    private Label phoneNoBrideLabelField;
    @javafx.fxml.FXML
    private Label nidBrideLabelField;
    @javafx.fxml.FXML
    private Label nidGroomLabelField;
    @javafx.fxml.FXML
    private Label emailBrideLabelField;
    @javafx.fxml.FXML
    private Label fullNameBrideLabelField;
    @javafx.fxml.FXML
    private Label emailGroomLabelField;
    @javafx.fxml.FXML
    private Label fullNameGroomLabelField;
    @javafx.fxml.FXML
    private Label fatherNameGroomLabelField;
    @javafx.fxml.FXML
    private Label motherNameGroomLabelField;
    @javafx.fxml.FXML
    private Label phoneNoGroomLabelField;
    @javafx.fxml.FXML
    private Label witness2Label;
    @javafx.fxml.FXML
    private Label witness1Label;

    MarriageApplication reviewApplication = MarriageApplication.readApplication("MarriageApplication.bin");

    @javafx.fxml.FXML
    public void initialize() {

        if (reviewApplication == null){
            return;
        }

        fullNameBrideLabelField.setText(reviewApplication.getFullNameBride());
        fullNameGroomLabelField.setText(reviewApplication.getFullNameGroom());
        fatherNameBrideLabelField.setText((reviewApplication.getFatherNameBride()));
        fatherNameGroomLabelField.setText(reviewApplication.getFatherNameGroom());
        motherNameBrideLabelField.setText(reviewApplication.getMotherNameBride());
        motherNameGroomLabelField.setText(reviewApplication.getMotherNameGroom());
        nidBrideLabelField.setText(String.valueOf(reviewApplication.getNidBride()));
        nidGroomLabelField.setText(String.valueOf(reviewApplication.getNidGroom()));
        phoneNoBrideLabelField.setText(String.valueOf(reviewApplication.getPhoneNumberBride()));
        phoneNoGroomLabelField.setText(String.valueOf(reviewApplication.getPhoneNumberGroom()));
        emailBrideLabelField.setText(reviewApplication.getEmailBride());
        emailGroomLabelField.setText(reviewApplication.getEmailGroom());
        witness1Label.setText(reviewApplication.getWitness1());
        witness2Label.setText(reviewApplication.getWitness2());

    }

    @javafx.fxml.FXML
    public void saveAndSubmitButtonOnAction(ActionEvent actionEvent) throws IOException {
        try{
            File f = new File("SavedApplications.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if(f.exists() && f.length()>0){
                fos = new FileOutputStream(f,true);
                oos = new appendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(reviewApplication);
            oos.close();
        }
        catch (Exception e){
            //
        }

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText("Application Submitted Successfully!");
        myAlert.setContentText("Your Application ID :"+reviewApplication.getApplicationID());
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void backAndGoToPersonalInformationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/personal-information-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Personal Information!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}