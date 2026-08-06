package com.example.kazi_office_and_marriage_register_office;

import javafx.scene.control.Alert;

import java.io.*;
import java.util.ArrayList;

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

    public static ArrayList<MarriageApplication> readBinaryFile(String pathName){
        ArrayList<MarriageApplication> applicationList = new ArrayList<>();
        try{
            File f = new File(pathName);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true){
                MarriageApplication application = (MarriageApplication) ois.readObject();
                applicationList.add(application);
            }
        }catch (EOFException e){
            //
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return applicationList;
    }

    public static void rewriteBinaryFile(String pathName, ArrayList<MarriageApplication> applicationList){
        try {
            File f = new File(pathName);
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (MarriageApplication app: applicationList){
                oos.writeObject(app);
            }
            oos.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
