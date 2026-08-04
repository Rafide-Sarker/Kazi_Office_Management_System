package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class RegisterMarriageController {
    @javafx.fxml.FXML
    private BorderPane RegisterMarriagePane;
    @javafx.fxml.FXML
    private TextField rmMarriageIdTF;
    @javafx.fxml.FXML
    private TableColumn rmMarriageIdTC;
    @javafx.fxml.FXML
    private TableColumn rmCertificateNoTC;
    @javafx.fxml.FXML
    private TextField rmApplicantIdTF;
    @javafx.fxml.FXML
    private TextField searchApproveMarriageFIlterTF;
    @javafx.fxml.FXML
    private TextField rmStatusTF;
    @javafx.fxml.FXML
    private TableColumn rmStatusTC;
    @javafx.fxml.FXML
    private TextField rmCertificateNumberTF;
    @javafx.fxml.FXML
    private TableColumn rmGroomTC;
    @javafx.fxml.FXML
    private TextField rmBrideNameTF;
    @javafx.fxml.FXML
    private TableColumn rmDateTC;
    @javafx.fxml.FXML
    private TextField rmGroomNameTF;
    @javafx.fxml.FXML
    private DatePicker rmMarriageDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn rmBrideTC;
    @javafx.fxml.FXML
    private TableView rmApprovedMarriageTV;

    @javafx.fxml.FXML
    public void registerMarriageOnAction(ActionEvent actionEvent) {
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
    public void searchApprovedMarriageFilterOnAction(ActionEvent actionEvent) {
    }
}
