package com.example.kazi_office_and_marriage_register_office;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

public class Receipt implements Serializable {

    private String receiptId;
    private LocalDate issueDate;
    private double paymentAmount;
    private String paymentMethod;
    private String paymentStatus;

    public Receipt(String receiptId, LocalDate issueDate, double paymentAmount, String paymentMethod, String paymentStatus) {
        this.receiptId = receiptId;
        this.issueDate = issueDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public Receipt() {
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
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

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptId=" + receiptId +
                ", issueDate=" + issueDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public static String generateReceiptID() {
        Random r = new Random();
        return LocalDate.now().getYear() +
                String.format("%04d", r.nextInt(10000));
    }
}
