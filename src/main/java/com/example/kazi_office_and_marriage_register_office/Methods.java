package com.example.kazi_office_and_marriage_register_office;
import com.example.kazi_office_and_marriage_register_office.Rafid.MarriageCertificate;

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

    //Read Binary File
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

    //reWrite Binary File
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

    //reWrite Certificate Binary FIle
    public static void rewriteCertificateBinaryFile(String pathName, ArrayList<MarriageCertificate> certificateList) {

        try {
            FileOutputStream fos = new FileOutputStream(pathName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (MarriageCertificate certificate : certificateList) {
                oos.writeObject(certificate);
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Write Certificate Binary File
    public static void writeCertificateBinaryFile(String pathName, MarriageCertificate certificate) {

        try {
            File f = new File(pathName);

            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new appendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(certificate);   // write ONE certificate
            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Read Certificate Binary File
    public static ArrayList<MarriageCertificate> readCertificateBinaryFile(String pathName) {

        ArrayList<MarriageCertificate> certificateList = new ArrayList<>();

        try {
            File f = new File(pathName);

            if (!f.exists()) {
                return certificateList;
            }

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                MarriageCertificate certificate =
                        (MarriageCertificate) ois.readObject();

                certificateList.add(certificate);
            }

        } catch (EOFException e) {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return certificateList;
    }

    public static ArrayList<Appointment> readAppointmentBinaryFile(String pathName) {

        ArrayList<Appointment> appointmentList = new ArrayList<>();

        try {
            File f = new File(pathName);

            if (!f.exists()) {
                return appointmentList;
            }

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                Appointment appointment =
                        (Appointment) ois.readObject();

                appointmentList.add(appointment);
            }

        } catch (EOFException e) {
            // Finished reading the file
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return appointmentList;
    }

    // Rewrite Appointment Binary File
    public static void rewriteAppointmentBinaryFile(String pathName, ArrayList<Appointment> appointmentList) {

        try {
            File f = new File(pathName);
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Appointment appointment : appointmentList) {
                oos.writeObject(appointment);
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
