package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ProccessRefundController {
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private TableColumn marriageIdTC;
    @javafx.fxml.FXML
    private TextField refundIdTextField;
    @javafx.fxml.FXML
    private TextField marriageIdTF;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TextField paymentIdTF;
    @javafx.fxml.FXML
    private TableColumn reasonTC;
    @javafx.fxml.FXML
    private TextField reasonTF;
    @javafx.fxml.FXML
    private TableView refundManagetableView;
    @javafx.fxml.FXML
    private TableColumn refundIdTC;

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @Deprecated
    public void backAndGoToDashboardButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectButtonOnAction(ActionEvent actionEvent) {
    }
}
