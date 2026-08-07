package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.Appointment;
import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ManageAppointmentController {

    @javafx.fxml.FXML
    private TableColumn<Appointment, String> maDateTC;
    @javafx.fxml.FXML
    private TextField maAppointmentIdTextField;
    @javafx.fxml.FXML
    private TextField maDateTextField;
    @javafx.fxml.FXML
    private TableColumn<Appointment, String > maAppointmentIdTC;
    @javafx.fxml.FXML
    private DatePicker maSearchAppointmentDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Appointment, String> maStatusTC;
    @javafx.fxml.FXML
    private TextField maTimeTextField;
    @javafx.fxml.FXML
    private TableColumn<Appointment, String> maTimeTC;
    @javafx.fxml.FXML
    private TableView<Appointment> maTableView;

    private ArrayList<Appointment> appointmentList;

    public void initialize(){
        appointmentList = Methods.readAppointmentBinaryFile("Appointment.bin");

        maAppointmentIdTC.setCellValueFactory(new PropertyValueFactory<>("appointmentId"));
        maDateTC.setCellValueFactory(new PropertyValueFactory<>("appointmentDate"));
        maTimeTC.setCellValueFactory(new PropertyValueFactory<>("time"));
        maStatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        maTableView.getItems().addAll(appointmentList);

        maTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, selectedValue)->{
                    if (selectedValue == null){
                        return;
                    }
                    maAppointmentIdTextField.setText(selectedValue.getAppointmentId());
                    maDateTextField.setText(String.valueOf(selectedValue.getAppointmentDate()));
                    maTimeTextField.setText(String.valueOf(selectedValue.getTime()));
                }
        );
    }

    @javafx.fxml.FXML
    public void cancelButtonOnAction() {
        Appointment selected = maTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            Methods.myAlert("Please select an appointment.");
            return;
        }

        appointmentList.remove(selected);
        Methods.rewriteAppointmentBinaryFile("Appointment.bin", appointmentList);
        maTableView.getItems().remove(selected);

        Methods.Alert("Appointment cancelled successfully.");
    }

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/kazi-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void FilterSearchOnAction() {
        LocalDate searchDate = maSearchAppointmentDatePicker.getValue();

        if (searchDate == null) {
            Methods.myAlert("Please select a date.");
            return;
        }

        maTableView.getItems().clear();

        for (Appointment a : appointmentList) {

            if (a.getAppointmentDate().equals(searchDate)) {
                maTableView.getItems().add(a);
            }
        }

        if (maTableView.getItems().isEmpty()) {
            Methods.myAlert("No appointment found for this date.");
        }
    }

    @javafx.fxml.FXML
    public void conFirmButtonOnAction() {
        Appointment selectedAppointment = maTableView.getSelectionModel().getSelectedItem();

        if (selectedAppointment == null) {
            Methods.myAlert("Please select an appointment.");
            return;
        }

        selectedAppointment.setStatus("Confirmed");

        Methods.rewriteAppointmentBinaryFile("Appointment.bin", appointmentList);

        try {
            FileWriter fw = getFileWriter(selectedAppointment);
            fw.close();
            maTableView.refresh();

            Methods.Alert("Appointment Confirmed Successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static FileWriter getFileWriter(Appointment selectedAppointment) throws IOException {
        File f = new File("MarriageAppointmentList.txt");

        FileWriter fw;

        if (f.exists()) {
            fw = new FileWriter(f, true);
            fw.write("\n\n");
        } else {
            fw = new FileWriter(f);
        }

        fw.write("========== Marriage Appointment ==========\n\n");
        fw.write("Appointment ID : " + selectedAppointment.getAppointmentId() + "\n");
        fw.write("Date           : " + selectedAppointment.getAppointmentDate() + "\n");
        fw.write("Time           : " + selectedAppointment.getTime() + "\n");
        fw.write("Status         : " + selectedAppointment.getStatus() + "\n");
        fw.write("===========================================\n");
        return fw;
    }

    @javafx.fxml.FXML
    public void ClearOnAction() {
        maSearchAppointmentDatePicker.setValue(null);
        maTableView.getItems().clear();
        maTableView.getItems().addAll(appointmentList);
    }
}
