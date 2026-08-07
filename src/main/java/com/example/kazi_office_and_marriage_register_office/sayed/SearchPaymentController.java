package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchPaymentController {
    @javafx.fxml.FXML
    private TextField reciptIdTF;
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private TableColumn marriageIdTC;
    @javafx.fxml.FXML
    private ComboBox statusComboBox;
    @javafx.fxml.FXML
    private TextField brideNameTF;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TextField paymentIdTF;
    @javafx.fxml.FXML
    private TableView searchPaymentTableView;
    @javafx.fxml.FXML
    private TableColumn paymentIdTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TextField groomNameTF;

    @javafx.fxml.FXML
    public void backonAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sayed/dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @Deprecated
    public void clearOnaction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backAndGoToDashboardButtononAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
