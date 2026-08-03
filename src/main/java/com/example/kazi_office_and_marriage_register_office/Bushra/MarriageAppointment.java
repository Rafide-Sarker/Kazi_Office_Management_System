package com.example.kazi_office_and_marriage_register_office.Bushra;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MarriageAppointment {
    @javafx.fxml.FXML
    public void backonaction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Bushra FXML/WitnessDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
