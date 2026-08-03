package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationAndAppointmentStatusController
{
    @javafx.fxml.FXML
    private Label applicationStatusLabel;
    @javafx.fxml.FXML
    private Label marriageDateLabel;
    @javafx.fxml.FXML
    private Label appointmentNumber;
    @javafx.fxml.FXML
    private Label applicationIdLabel;
    @javafx.fxml.FXML
    private Label timeSlotLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoard(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}