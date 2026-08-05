package com.example.kazi_office_and_marriage_register_office;

import javafx.scene.control.Alert;

public class Methods {
    public static void myAlert(String alertText){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(alertText);
        a.showAndWait();
        return;
    }

    public static void Alert(String alertText) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(alertText);
        a.showAndWait();
        return;
    }
}
