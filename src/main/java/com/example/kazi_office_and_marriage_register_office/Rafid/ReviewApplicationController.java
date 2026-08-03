package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReviewApplicationController {
    @javafx.fxml.FXML
    private BorderPane reviewApplicationBorderPane;

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
    public void approveMarriageOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectMarriageOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateCirtificateOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/generate-certificate-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
