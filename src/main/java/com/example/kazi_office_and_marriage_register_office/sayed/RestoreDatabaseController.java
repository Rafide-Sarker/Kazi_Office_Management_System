package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RestoreDatabaseController
{
    @javafx.fxml.FXML
    private TextField backupFilePathTextField;
    @javafx.fxml.FXML
    private Label fileStatusLabel;
    @javafx.fxml.FXML
    private Label selectFileValueLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backAndGoToDashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/system-admin-dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("System Admin Dashboard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void restoreDatabseButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void chooseFileButtonOnAction(ActionEvent actionEvent) {
    }
}