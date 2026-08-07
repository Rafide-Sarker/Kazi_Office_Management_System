package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.Appointment;
import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.MarriageApplication;
import com.example.kazi_office_and_marriage_register_office.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

        MarriageApplication application =
                MarriageApplication.searchApplicationByUser("MarriageApplication.bin",
                        User.currentUser.getEmail()
                );

        Appointment appointment = Appointment.readAppointment("Appointment.bin");

        if(application != null){
            applicationIdLabel.setText(application.getApplicationID());
            applicationStatusLabel.setText(application.getStatus());
        }
        if (appointment !=null){
            appointmentNumber.setText(appointment.getAppointmentId());
            marriageDateLabel.setText(appointment.getAppointmentDate().toString());
            timeSlotLabel.setText(appointment.getTime().toString());
        }
    }

    @javafx.fxml.FXML
    public void backAndGoToDashBoard(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}