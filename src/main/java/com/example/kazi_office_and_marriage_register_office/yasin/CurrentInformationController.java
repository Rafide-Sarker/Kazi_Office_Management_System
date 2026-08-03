package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CurrentInformationController
{
    @javafx.fxml.FXML
    private Label brideNameLabel;
    @javafx.fxml.FXML
    private Label addressLabel;
    @javafx.fxml.FXML
    private Label phoneNumberLabel;
    @javafx.fxml.FXML
    private Label emailLabel;

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

    @javafx.fxml.FXML
    public void editInformationAndGoToEditPage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/edit-current-information-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Edit Information!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}