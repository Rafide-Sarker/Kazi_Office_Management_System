package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateReportController {
    @javafx.fxml.FXML
    private BorderPane generateReportPane;
    @javafx.fxml.FXML
    private TextField grActiveRecordTextField;
    @javafx.fxml.FXML
    private DatePicker grToDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox grReportTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox grStatusComboBox;
    @javafx.fxml.FXML
    private TextField grTotalRecordTextField;
    @javafx.fxml.FXML
    private TextField grArchivedRecordTextField;
    @javafx.fxml.FXML
    private DatePicker grFromDateDatePicker;

    public void initialize(){

    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
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
    public void downloadReeportOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearGenerateReportOnAction(ActionEvent actionEvent) {
    }
}
