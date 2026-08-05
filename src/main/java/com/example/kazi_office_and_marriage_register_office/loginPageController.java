package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginPageController {
    @javafx.fxml.FXML
    private Label Hudai;
    @javafx.fxml.FXML
    private ComboBox<String> selectRoleUserLoginComboBox;
    @javafx.fxml.FXML
    private TextField loginPageUserNameTF;
    @javafx.fxml.FXML
    private PasswordField loginPagePasswordPF;

    public void initialize(){
        selectRoleUserLoginComboBox.getItems().setAll("Bride", "Groom","Kazi","Registrar","Witness","Accountant","System Admin");
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
        try{
            if (selectRoleUserLoginComboBox.getValue().equals("Bride") ||selectRoleUserLoginComboBox.getValue().equals("Groom") ){
                loginMethod("yasin/DashBoard-view.fxml", actionEvent);
            } else if (selectRoleUserLoginComboBox.getValue().equals("Kazi")) {
                if (User.kazi.getUserName().equals(loginPageUserNameTF.getText()) && User.kazi.getPassword().equals(loginPagePasswordPF.getText())){
                    loginMethod("rafid_fxml/kazi-dashboard-view.fxml", actionEvent);
                }else {
                    Methods.myAlert("Wrong User Name or Password");
                }
            } else if (selectRoleUserLoginComboBox.getValue().equals("Registrar")) {
                if (User.registrar.getUserName().equals(loginPageUserNameTF.getText()) && User.registrar.getPassword().equals(loginPagePasswordPF.getText())){
                    loginMethod("rafid_fxml/registrar-dashboard-view.fxml", actionEvent);
                }else {
                    Methods.myAlert("Wrong User Name or Password");
                }
            } else if (selectRoleUserLoginComboBox.getValue().equals("Accountant")) {
                loginMethod("sayed/dashboard-view.fxml", actionEvent);
            } else if (selectRoleUserLoginComboBox.getValue().equals("Witness")){
                loginMethod("Bushra FXML/WitnessDashboard.fxml", actionEvent);
            }else if (selectRoleUserLoginComboBox.getValue().equals("System Admin")){
                loginMethod("sayed/system-admin-dashboard.fxml",actionEvent);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
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
