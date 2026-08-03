package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistryManagementController {

    @javafx.fxml.FXML
    private BorderPane registryManagementPane;

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafid_fxml/registrar-dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Kazi Office");
        nextStage.setScene(scene);
        nextStage.show();
    }


    @javafx.fxml.FXML
    public void searchRegisteredMarriageFilterOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void issueDuplicateOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void verifyCertificateOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateMarriageRegistryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void archiveMarriageRegistryOnAction(ActionEvent actionEvent) {
    }
}
