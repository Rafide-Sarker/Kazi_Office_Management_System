package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController
{
    @javafx.fxml.FXML
    private BorderPane boarderPaneDashBoard;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadCertificateButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/download-certificate-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("login Page!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void requestCorrectionButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/correction-request-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Correction Request!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void applyForMarriageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/marriageConsent-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void viewApplicationStatusButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/application-appointment-status-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void scheduleMarriageDateButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/schedule-marriage-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void updatePersonalInformationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/current-information-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void payRegistrationFeeButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/payment-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void uploadDocumentsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/upload-documents-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Upload Documents!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}