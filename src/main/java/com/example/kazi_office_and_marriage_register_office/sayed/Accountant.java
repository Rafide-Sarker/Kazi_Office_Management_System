package com.example.kazi_office_and_marriage_register_office.sayed;

import com.example.kazi_office_and_marriage_register_office.User;

public class Accountant extends User {
    private String accountantId;


    public Accountant(String userID, String userName, String email, String address, String role, String password, int phoneNumber, String accountantId) {
        super(userID, userName, email, address, role, password, phoneNumber);
        this.accountantId = accountantId;
    }

    public Accountant(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        super(userID, userName, email, address, role, password, phoneNumber);
    }


    public Accountant() {
    }

    public String getAccountantId() {
        return accountantId;
    }

    public void setAccountantId(String accountantId) {
        this.accountantId = accountantId;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "accountantId='" + accountantId + '\'' +
                '}';
    }

    public void collectFee() {
        return ;
    }

    public boolean verifyPayment() {
        return false;
    }

    public void generateReceipt() {
        return ;
    }

    public boolean processRefund() {
        return false;
    }

    public void dailyReport() {
        return ;
    }

    public void monthlyReport() {
        return ;
    }

    public void searchPayment() {
        return ;
    }

    public void exportFinancialReport() {
        return ;
    }
}
