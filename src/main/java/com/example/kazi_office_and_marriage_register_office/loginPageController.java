package com.example.kazi_office_and_marriage_register_office;

import com.example.kazi_office_and_marriage_register_office.Rafid.Kazi;
import com.example.kazi_office_and_marriage_register_office.Rafid.Registrar;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;

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
            if (selectRoleUserLoginComboBox.getValue().equals("Bride")){

                User user = login(loginPageUserNameTF.getText() , loginPagePasswordPF.getText(), selectRoleUserLoginComboBox.getValue());
                if (user == null){
                    Methods.myAlert("Invalid Username, Password or Role");
                } else{
                    User.currentUser = user;
                    loginMethod("yasin/DashBoard-view.fxml", actionEvent);
                }
            }
            else if (selectRoleUserLoginComboBox.getValue().equals("Groom")){

                User user = login(loginPageUserNameTF.getText() , loginPagePasswordPF.getText(), selectRoleUserLoginComboBox.getValue());
                if (user == null){
                    Methods.myAlert("Invalid Username, Password or Role");
                } else{
                    User.currentUser = user;
                    loginMethod("yasin/DashBoard-view.fxml", actionEvent);
                }
            }
            else if (selectRoleUserLoginComboBox.getValue().equals("Kazi")) {
                if (Kazi.kazi.getUserName().equals(loginPageUserNameTF.getText()) && User.kazi.getPassword().equals(loginPagePasswordPF.getText())){
                    loginMethod("rafid_fxml/kazi-dashboard-view.fxml", actionEvent);
                }else {
                    Methods.myAlert("Wrong User Name or Password");
                }
            } else if (selectRoleUserLoginComboBox.getValue().equals("Registrar")) {
                if (Registrar.registrar.getUserName().equals(loginPageUserNameTF.getText()) && User.registrar.getPassword().equals(loginPagePasswordPF.getText())){
                    loginMethod("rafid_fxml/registrar-dashboard-view.fxml", actionEvent);
                }else {
                    Methods.myAlert("Wrong User Name or Password");
                }
            } else if (selectRoleUserLoginComboBox.getValue().equals("Accountant")) {
                if (User.accountant.getUserName().equals(loginPageUserNameTF.getText()) && User.accountant.getPassword().equals(loginPagePasswordPF.getText())){
                    loginMethod("sayed/dashboard-view.fxml", actionEvent);
                }else {
                    Methods.myAlert("Wrong User Name or Password");
                }

            } else if (selectRoleUserLoginComboBox.getValue().equals("Witness")){
                User user = login(loginPageUserNameTF.getText(),loginPagePasswordPF.getText(),selectRoleUserLoginComboBox.getValue());
                if (user == null){
                    Methods.myAlert("Invalid user name, password or role");
                }
                else {
                    User.currentUser = user;
                    loginMethod("Bushra FXML/WitnessDashboard.fxml", actionEvent);
                }

            }else if (selectRoleUserLoginComboBox.getValue().equals("System Admin")){
                if (User.systemAdmin.getUserName().equals(loginPageUserNameTF.getText()) && User.systemAdmin.getPassword().equals(loginPagePasswordPF.getText())){
                    loginMethod("sayed/system-admin-dashboard.fxml", actionEvent);
                }else {
                    Methods.myAlert("Wrong User Name or Password");
                }

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

    public static User login(String username, String password, String role) {

        File file = new File("Users.bin");

        if (!file.exists()) {
            return null;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {

                User user = (User) ois.readObject();

                if (user.getUserName().equals(username)
                        && user.getPassword().equals(password)
                        && user.getRole().equals(role)) {

                    ois.close();
                    return user;
                }
            }

        } catch (EOFException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
