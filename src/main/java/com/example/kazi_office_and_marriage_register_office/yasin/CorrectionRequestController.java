package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CorrectionRequestController
{
    @javafx.fxml.FXML
    private TextField uploadDocumentsTextField;
    @javafx.fxml.FXML
    private ComboBox correctionTypeComboBox;
    @javafx.fxml.FXML
    private TextField reasonTextField;
    @javafx.fxml.FXML
    private TextField correctInformationTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void submitAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {
        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Request Submitted");
        myAlert.setHeaderText(null);
        myAlert.setContentText("Correction request submitted successfully!\n" +
                                  "The Marriage Registrar Office has been notified.");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void chooseFileButtonOnAction(ActionEvent actionEvent) {
        // uploadDocumentsTextField.setText("Documents Uploaded");
    }
}