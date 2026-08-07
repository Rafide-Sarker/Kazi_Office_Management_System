package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import com.example.kazi_office_and_marriage_register_office.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class CorrectionRequestController
{
    @javafx.fxml.FXML
    private TextField uploadDocumentsTextField;
    @javafx.fxml.FXML
    private ComboBox<String>correctionTypeComboBox;
    @javafx.fxml.FXML
    private TextField reasonTextField;
    @javafx.fxml.FXML
    private TextField correctInformationTextField;
    @javafx.fxml.FXML
    private Label applicationIdLabel;

    private MarriageApplication application;

    @javafx.fxml.FXML
    public void initialize() {

        correctionTypeComboBox.getItems().addAll(
                "Bride Name",
                "Groom Name",
                "Bride Address",
                "Groom Address",
                "Bride Phone Number",
                "Groom Phone Number",
                "Bride Email",
                "Groom Email",
                "NID",
                "Date of Birth",
                "Other"
        );
        application = MarriageApplication.searchApplicationByUser("MarriageApplication.bin",
                User.currentUser.getEmail()
        );

        if (application != null) {
            applicationIdLabel.setText(application.getApplicationID());
        }
    }

    @javafx.fxml.FXML
    public void chooseFileButtonOnAction(ActionEvent actionEvent) {
        uploadDocumentsTextField.setText("Documents Uploaded");
    }

    @javafx.fxml.FXML
    public void submitAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {

        if (correctionTypeComboBox.getValue() == null
                || reasonTextField.getText().isEmpty()
                || correctInformationTextField.getText().isEmpty()) {

            Methods.myAlert("Please fill up all fields.");
            return;
        }

        CorrectionRequest request = new CorrectionRequest(
                CorrectionRequest.generateRequestId(),
                application.getApplicationID(),
                correctionTypeComboBox.getValue(),
                reasonTextField.getText(),
                correctInformationTextField.getText(),
                uploadDocumentsTextField.getText(),
                "Pending"
        );

        CorrectionRequest.saveBinaryFile("CorrectionRequest.bin", request);

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Request Submitted");
        myAlert.setHeaderText(null);
        myAlert.setContentText("Correction request submitted successfully!\n" +
                                  "The Marriage Registrar Office has been notified.");
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