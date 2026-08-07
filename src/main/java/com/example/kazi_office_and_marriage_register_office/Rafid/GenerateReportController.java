package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import com.example.kazi_office_and_marriage_register_office.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GenerateReportController {

    @javafx.fxml.FXML
    private DatePicker grToDateDatePicker;
    @javafx.fxml.FXML
    private TextField grTotalRecordTextField;
    @javafx.fxml.FXML
    private DatePicker grFromDateDatePicker;
    @javafx.fxml.FXML
    private TextField grToDateTF;
    @javafx.fxml.FXML
    private TextField grReprotDateTF;
    @javafx.fxml.FXML
    private TextField grFromDateTF;

    public void initialize(){

    }

    @javafx.fxml.FXML
    public void generateReportOnAction() {
        LocalDate from = grFromDateDatePicker.getValue();
        LocalDate to = grToDateDatePicker.getValue();

        if (from == null || to == null){
            Methods.myAlert("Please Select Both Date");
            return;
        }
        if (from.isAfter(LocalDate.now()) || to.isAfter(LocalDate.now())){
            Methods.myAlert("From or To Date Can't be Future  Date");
            return;
        }
        if (from.isAfter(to)){
            Methods.myAlert("From Date Can't be After To Date");
            return;
        }
        ArrayList<MarriageCertificate> recordedMarriageList = Methods.readCertificateBinaryFile("RegisteredMarriage.bin");

        int total = 0;
        for (MarriageCertificate c: recordedMarriageList){
            LocalDate marriageDate = c.getMarriageDate();
            if ((marriageDate.isEqual(from) || marriageDate.isAfter(from)) && (marriageDate.isEqual(to) || marriageDate.isBefore(to))){
                total++;
            }
        }
        grTotalRecordTextField.setText(String.valueOf(total));
        grFromDateTF.setText(String.valueOf(from));
        grToDateTF.setText(String.valueOf(to));
        grReprotDateTF.setText(String.valueOf(LocalDate.now()));

        Methods.Alert("Report Generated Successfully.");
    }

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/registrar-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void downloadReeportOnAction() {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String fileName = "MarriageReport_" + LocalDateTime.now().format(formatter) + ".txt";

            File f = new File(fileName);
            FileWriter fw = new FileWriter(f);
            fw.write("========== Marriage Report ==========\n\n");
            fw.write("Report Date : " + grReprotDateTF.getText() + "\n");
            fw.write("From Date   : " + grFromDateTF.getText() + "\n");
            fw.write("To Date     : " + grToDateTF.getText() + "\n");
            fw.write("Total Record: " + grTotalRecordTextField.getText() + "\n");

            fw.close();

            Methods.Alert("Report downloaded successfully.\nSaved as: " + fileName);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void clearGenerateReportOnAction() {
        grFromDateDatePicker.setValue(null);
        grToDateDatePicker.setValue(null);

        grFromDateTF.clear();
        grToDateTF.clear();
        grReprotDateTF.clear();
        grTotalRecordTextField.clear();
    }
}
