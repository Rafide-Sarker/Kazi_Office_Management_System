package com.example.kazi_office_and_marriage_register_office.yasin;

import java.time.LocalDate;

public class Groom extends MarriageApplicant{
    private String groomId;

    public String getGroomId() {
        return groomId;
    }

    public void setGroomId(String groomId) {
        this.groomId = groomId;
    }

    public Groom(String userID, String userName, String email, String address, String role, String password, int phoneNumber, int nid, LocalDate dob, String maritalStatus, String groomId) {
        super(userID, userName, email, address, role, password, phoneNumber, nid, dob, maritalStatus);
        this.groomId = groomId;
    }

    public Groom() {
    }

    @Override
    public String toString() {
        return "Groom{" +
                "groomId='" + groomId + '\'' +
                '}';
    }
}
