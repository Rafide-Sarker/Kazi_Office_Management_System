package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.Appointment;
import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleMarriageController
{
    @javafx.fxml.FXML
    private ComboBox<LocalTime> availableTimeSlotComboBox;
    @javafx.fxml.FXML
    private DatePicker marriageDateDP;



    @javafx.fxml.FXML
    public void initialize() {
        availableTimeSlotComboBox.getItems().addAll(
                LocalTime.of(10, 0),
                LocalTime.of(11, 0),
                LocalTime.of(12, 0),
                LocalTime.of(13, 0),
                LocalTime.of(14, 0),
                LocalTime.of(15, 0)
        );
    }

    @javafx.fxml.FXML
    public void confirmAndGoToDashBoardButtonOnAction(ActionEvent actionEvent) throws IOException {

        if(marriageDateDP.getValue()==null || availableTimeSlotComboBox.getValue() == null){
            Methods.myAlert("Please select a date and time");
            return;
        }
        if (marriageDateDP.getValue().isBefore(LocalDate.now())) {
            Methods.myAlert("Please select today or a future date.");
            return;
        }
        String appointmentId = Appointment.generateAppointmentId();

        Appointment a = new Appointment(
                appointmentId,
                marriageDateDP.getValue(),
                availableTimeSlotComboBox.getValue(),
                "Approved"
        );

        Appointment.AppointmentBinaryFile("Appointment.bin",a);

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setTitle("Success");
        myAlert.setHeaderText(" Marriage Date Scheduled Successfully!");
        myAlert.setContentText("Appointment No:"+appointmentId);
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