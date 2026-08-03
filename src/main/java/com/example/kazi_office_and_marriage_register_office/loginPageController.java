package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginPageController {
    @javafx.fxml.FXML
    private Label Hudai;
    @javafx.fxml.FXML
    private ComboBox<String> selectRoleUserLoginComboBox;

    public void initialize(){
        selectRoleUserLoginComboBox.getItems().setAll("Bride", "Groom","Kazi","Registrar","Witness","Accountant");
    }

    public void loginMethod(String fxmlAddress, ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlAddress));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("DashBoard!");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        if (selectRoleUserLoginComboBox.getValue().equals("Bride") ||selectRoleUserLoginComboBox.getValue().equals("Groom") ){
            loginMethod("yasin/DashBoard-view.fxml", actionEvent);
        } else if (selectRoleUserLoginComboBox.getValue().equals("Kazi")) {
            loginMethod("rafid_fxml/kazi-dashboard-view.fxml", actionEvent);
        } else if (selectRoleUserLoginComboBox.getValue().equals("Registrar")) {
            loginMethod("rafid_fxml/registrar-dashboard-view.fxml", actionEvent);
        } else if (selectRoleUserLoginComboBox.getValue().equals("Accountant")) {
            loginMethod("sayed/dashboard-view.fxml", actionEvent);
        } else if (selectRoleUserLoginComboBox.getValue().equals("Witness")){
            loginMethod("Bushra FXML/WitnessDashboard.fxml", actionEvent);
        }
    }


    @javafx.fxml.FXML
    public void forgetPasswordButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("forget-password-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Forget Password Page");
        nextStage.setScene(scene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void createNewAccountOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("create-new-account-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Create New Account Page");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
