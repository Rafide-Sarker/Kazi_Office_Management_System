package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;

public class Receipt {

    private int receiptId;
    private String receiptNumber;
    private LocalDate issueDate;
    private double paymentAmount;
    private String paymentMethod;
    private String paymentStatus;

    public Receipt(int receiptId, String receiptNumber, LocalDate issueDate, double paymentAmount, String paymentMethod, String paymentStatus) {
        this.receiptId = receiptId;
        this.receiptNumber = receiptNumber;
        this.issueDate = issueDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public Receipt() {
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
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
                ", receiptNumber='" + receiptNumber + '\'' +
                ", issueDate=" + issueDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public boolean generateReceipt(){
        return true;
    }
    public boolean printReceipt(){
        return true;
    }
    public boolean downloadReceipt(){
        return true;
    }
    public boolean viewReceipt(){
        return true;
    }
}
