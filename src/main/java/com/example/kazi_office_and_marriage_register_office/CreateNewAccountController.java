package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.Random;

import static com.example.kazi_office_and_marriage_register_office.Methods.myAlert;

public class CreateNewAccountController {
    @javafx.fxml.FXML
    private PasswordField createAccountConfirmPasswordPF;
    @javafx.fxml.FXML
    private ComboBox<String> createAccountSelectRoleTF;
    @javafx.fxml.FXML
    private TextField createAccountEmailTF;
    @javafx.fxml.FXML
    private TextField createAccountUsernameTF;
    @javafx.fxml.FXML
    private PasswordField createAccountPasswordPF;
    @javafx.fxml.FXML
    private TextField createAccountPhoneNumberTF;

    public void initialize(){
        createAccountSelectRoleTF.getItems().setAll("Marriage Applicant", "Witness");
    }

    @javafx.fxml.FXML
    public void createNewAccountOnAction(ActionEvent actionEvent) {

        String email = createAccountEmailTF.getText();
        if (createAccountUsernameTF.getText().isEmpty() || createAccountEmailTF.getText().isEmpty() || createAccountSelectRoleTF.getValue() == null || createAccountPhoneNumberTF.getText().isEmpty() || createAccountPasswordPF.getText().isEmpty() || createAccountConfirmPasswordPF.getText().isEmpty()){
            myAlert("All field must be Filled");
        } else if (!createAccountPasswordPF.getText().equals(createAccountConfirmPasswordPF.getText())) {
            myAlert("Password and Confirm Password must be same");
        } else if (!email.contains("@") || !email.contains(".") || email.indexOf("@") > email.lastIndexOf(".")) {
           myAlert("Enter Valid Email");
        } else if (!createAccountPhoneNumberTF.getText().matches("\\d+")) {
            myAlert("Phone Number must be only Digits");
        }else {
            String userId = generateRandomId();
            User user = new User(
                    userId,
                    createAccountUsernameTF.getText(),
                    createAccountEmailTF.getText(),
                    "",
                    createAccountSelectRoleTF.getValue(),
                    createAccountPasswordPF.getText(),
                    Integer.parseInt(createAccountPhoneNumberTF.getText())
            );

            User.writeBinaryFile("Users.bin", user);
        }


    }

    @javafx.fxml.FXML
    public void backToLoginPageOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Login Page");
        nextStage.setScene(scene);
        nextStage.show();
    }
    


    public String generateRandomId(){
        String suggestedId;
        do {
            String firstFourDigit = String.valueOf(LocalDate.now().getYear());
            Random r = new Random();
            String lastFourDigit = String.format("%4d", r.nextInt(10000));
            suggestedId = firstFourDigit + lastFourDigit;
        }while (searchUserByID("Users.bin", suggestedId) != null);

        return suggestedId;
    }

    public static User searchUserByID(String pathName, String userID) {

        try {
            FileInputStream fis = new FileInputStream(pathName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                User user = (User) ois.readObject();

                if (user.getUserID().equals(userID)) {
                    ois.close();
                    return user;
                }
            }

        }catch (EOFException e) {
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}

