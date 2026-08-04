package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReviewApplicationController {
    @javafx.fxml.FXML
    private BorderPane reviewApplicationBorderPane;
    @javafx.fxml.FXML
    private CheckBox verifyBrideCheckBox;
    @javafx.fxml.FXML
    private TextField raGroomNidTF;
    @javafx.fxml.FXML
    private TextField raBrideAddressTF;
    @javafx.fxml.FXML
    private TextField raGroomAddressTF;
    @javafx.fxml.FXML
    private TextField raGroomPhoneTF;
    @javafx.fxml.FXML
    private DatePicker raApplicationDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox raSearchStatusComboBox;
    @javafx.fxml.FXML
    private TextField raBridePhoneTF;
    @javafx.fxml.FXML
    private TextField raBrideNIDTF;
    @javafx.fxml.FXML
    private TextField raBrideDOBTF;
    @javafx.fxml.FXML
    private TextField raApplicationIdTF;
    @javafx.fxml.FXML
    private TextField raSearchBrideNameTF;
    @javafx.fxml.FXML
    private CheckBox verifyGroomCheckBox;
    @javafx.fxml.FXML
    private TextField raGroomNameTF;
    @javafx.fxml.FXML
    private TextField raGroomDobTF;
    @javafx.fxml.FXML
    private TextField raSearchGroomNameTF;
    @javafx.fxml.FXML
    private ListView raUploadedDocumentListView;
    @javafx.fxml.FXML
    private TextField raWitness2TF;
    @javafx.fxml.FXML
    private TextField raWitness1TF;
    @javafx.fxml.FXML
    private TextField raBrideNameTF;

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

    @javafx.fxml.FXML
    public void searchReviewApplicationOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearSearchReviewApplicationOnAction(ActionEvent actionEvent) {
    }
}
