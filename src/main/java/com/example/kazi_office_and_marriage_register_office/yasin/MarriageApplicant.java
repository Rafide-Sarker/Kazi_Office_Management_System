package com.example.kazi_office_and_marriage_register_office.yasin;


import com.example.kazi_office_and_marriage_register_office.User;

import java.time.LocalDate;

public class MarriageApplicant extends User {

    private int nid;
    private LocalDate dob;
    private String maritalStatus;

    public MarriageApplicant(String userID, String userName, String email, String address, String role, String password, int phoneNumber, int nid, LocalDate dob, String maritalStatus) {
        super(userID, userName, email, address, role, password, phoneNumber);
        this.nid = nid;
        this.dob = dob;
        this.maritalStatus = maritalStatus;
    }



    public MarriageApplicant(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        super(userID, userName, email, address, role, password, phoneNumber);
    }

    public MarriageApplicant() {
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "MarriageApplicant{" +
                "nid=" + nid +
                ", dob=" + dob +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }

    public boolean applyMarriage() {
        return true;
    }

    public boolean submitConsent() {
        return true;
    }

    public boolean uploadDocuments() {
        return true;
    }

    public boolean confirmApplication() {
        return true;
    }

    public void scheduleMarriage() {
        return ;
    }

    public String viewApplicationStatus() {
        return null ;
    }

    public void payRegistrationFee() {
        return ;
    }

    public void downloadCertificate() {
        return ;
    }

    public boolean updateProfile() {
        return true;
    }

    public void viewAppointment() {
        return ;
    }

    public boolean requestCorrection() {
        return true;
    }
}
