package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.User;

public class Kazi extends User {
    private String kaziId, licenseNo, officeName, designation, status;

    public Kazi(String userID, String userName, String email, String address, String role, String password, int phoneNumber, String kaziId, String licenseNo, String officeName, String designation, String status) {
        super(userID, userName, email, address, role, password, phoneNumber);
        this.kaziId = kaziId;
        this.licenseNo = licenseNo;
        this.officeName = officeName;
        this.designation = designation;
        this.status = status;
    }

    public Kazi(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        super(userID, userName, email, address, role, password, phoneNumber);
    }

    public Kazi() {
    }

    public static Kazi kazi = new Kazi("Kazi","Kazi", "kazi@gmail.com", "Dhaka", "Kazi", "12345678", 0161616161, "kazi101", "Lis101", "Office", "Kazi", "Active");

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Kazi{" +
                "kaziId='" + kaziId + '\'' +
                ", licenseNo='" + licenseNo + '\'' +
                ", officeName='" + officeName + '\'' +
                ", designation='" + designation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }



}
