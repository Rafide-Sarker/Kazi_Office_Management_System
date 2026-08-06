package com.example.kazi_office_and_marriage_register_office.Bushra;

import com.example.kazi_office_and_marriage_register_office.User;

import java.time.LocalDate;

public class Witness extends User {
    private String witnessId;
    private String nid;
    private LocalDate dob;

    public Witness(String userID, String userName, String email, String address, String role, String password, int phoneNumber, String witnessId, String nid, LocalDate dob) {
        super(userID, userName, email, address, role, password, phoneNumber);
        this.witnessId = witnessId;
        this.nid = nid;
        this.dob = dob;
    }

    public Witness() {
    }

    public Witness(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        super(userID, userName, email, address, role, password, phoneNumber);
    }

    public String getWitnessId() {
        return witnessId;
    }

    public void setWitnessId(String witnessId) {
        this.witnessId = witnessId;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Witness{" +
                "witnessId='" + witnessId + '\'' +
                ", nid='" + nid + '\'' +
                ", dob=" + dob +
                '}';
    }

    public boolean registerWitness() {
        return false;
    }

    public void uploadDocuments() {
        return;
    }

    public boolean verifyIdentity() {
        return false;
    }

    public boolean confirmAttendance() {
        return false;
    }

    public boolean giveConsent() {
        return false;
    }

    public boolean digitalSignature() {
        return false;
    }

    public void viewAppointment() {
        return;
    }

    public boolean updateProfile() {
        return false;
    }


}

