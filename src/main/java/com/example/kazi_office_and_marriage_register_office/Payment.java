package com.example.kazi_office_and_marriage_register_office;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class Payment implements Serializable {
    private String paymentId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private String transactionId;
    private String mobileNumber;

    private Receipt receipt;  // composition

    public Payment (){
        this.receipt = new Receipt();
    }

    public Payment(String paymentId, double amount, String paymentMethod, String paymentStatus, String transactionId, String mobileNumber) {

        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
        this.mobileNumber = mobileNumber;
        this.receipt = new Receipt();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public static <T> void savePaymentBinaryFile(String pathName , T object){

        try{
            File f = new File(pathName);
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new appendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f,true);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(object);
            oos.close();
        }
        catch (Exception e){
            //
        }
    }

    public static Payment readPayment(String pathName) {

        File f = new File(pathName);

        if (!f.exists()) {
            return null;
        }

        Payment payment = null;

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                payment = (Payment) ois.readObject();
            }

        } catch (EOFException e) {
            return payment;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String generatePaymentId(){
        Random r = new Random();
        return LocalDate.now().getYear() + String.format("%04d",r.nextInt(10000));
    }

    public void pay(){
        return;
    }

    public void verify(){
        return;
    }
}
