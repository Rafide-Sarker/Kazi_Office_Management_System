package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;

public class ScheduleMarriageController
{
    @javafx.fxml.FXML
    private ComboBox availableTimeSlotComboBox;
    @javafx.fxml.FXML
    private DatePicker marriageDateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {

        // appointmentId

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(" Marriage Date Scheduled Successfully!");
        myAlert.setContentText("Appointment No:");
        myAlert.showAndWait();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
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
}