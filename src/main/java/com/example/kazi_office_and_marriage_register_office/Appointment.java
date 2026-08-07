package com.example.kazi_office_and_marriage_register_office;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Appointment implements Serializable {
    private String appointmentId;
    private LocalDate appointmentDate;
    private LocalTime time;
    private Boolean status;

    public Appointment(String appointmentId, LocalDate appointmentDate, LocalTime time, Boolean status) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.time = time;
        this.status = status;
    }

    public Appointment() {
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", time=" + time +
                ", status=" + status +
                '}';
    }

    public static <T> void AppointmentBinaryFile(String pathName , T object){

       try{
           File f = new File(pathName);
           FileOutputStream fos = null;
           ObjectOutputStream oos = null;

           if(f.exists()){
               fos = new FileOutputStream(f , true);
               oos = new appendableObjectOutputStream(fos);
           }
           else{
               fos = new FileOutputStream(f);
               oos = new ObjectOutputStream(fos);
           }
           oos.writeObject(object);
           oos.close();
       } catch (IOException e) {
           //
       }
    }

    public static Appointment readAppointment(String pathName) {

        File file = new File(pathName);

        if (!file.exists()) {
            return null;
        }

        Appointment appointment = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                appointment = (Appointment) ois.readObject();
            }

        } catch (EOFException e) {
            return appointment;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String generateAppointmentId(){
        Random r = new Random();

        return LocalDate.now().getYear()+String.format("%04d",r.nextInt(10000));
    }

    public void schedule(){
        return;
    }

    public void update(){
        return;
    }
}
