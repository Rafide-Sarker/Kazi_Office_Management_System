package com.example.kazi_office_and_marriage_register_office.yasin;

import java.time.LocalDate;

public class Bride extends MarriageApplicant {

    private String brideId;

    public String getBrideId() {
        return brideId;
    }

    public void setBrideId(String brideId) {
        this.brideId = brideId;
    }


    public Bride(String userID, String userName, String email, String address, String role, String password, int phoneNumber, int nid, LocalDate dob, String maritalStatus , String brideId) {
        super(userID, userName, email, address, role, password, phoneNumber, nid, dob, maritalStatus);

        this.brideId = brideId;
    }

    public Bride() {
    }

    @Override
    public String toString() {
        return "Bride{" +
                "brideId='" + brideId + '\'' +
                '}';
    }

}
