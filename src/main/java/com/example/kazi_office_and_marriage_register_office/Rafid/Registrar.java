package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.User;

public class Registrar extends User {
    private int registrationNo;
    private String registrarId, officeName, designation, status;

    public Registrar(String userID, String userName, String email, String address, String role, String password, int phoneNumber, int registrationNo, String registrarId, String officeName, String designation, String status) {
        super(userID, userName, email, address, role, password, phoneNumber);
        this.registrationNo = registrationNo;
        this.registrarId = registrarId;
        this.officeName = officeName;
        this.designation = designation;
        this.status = status;
    }
    public static Registrar registrar = new Registrar("Registrar","Registrar", "registrar@gmail.com", "Dhaka", "Registrar", "12345678", 01616161616, 001, "reg101", "Office", "Registrar", "Active");


    public Registrar(String userID, String userName, String email, String address, String role, String password, int phoneNumber) {
        super(userID, userName, email, address, role, password, phoneNumber);
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRegistrarId() {
        return registrarId;
    }

    public void setRegistrarId(String registrarId) {
        this.registrarId = registrarId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Registrar{" +
                "registrationNo=" + registrationNo +
                ", registrarId='" + registrarId + '\'' +
                ", officeName='" + officeName + '\'' +
                ", designation='" + designation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void registerApprovedMarriage(){
        return;
    }
    public void storeMarriageRecord(){
        return;
    }
    public void updateRegistry(){
        return;
    }
    public void verifyCertificate(){
        return;
    }
    public void issueDuplicateCertificate(){
        return;
    }
    public void searchRecords(){
        return;
    }
    public void generateReports(){
        return;
    }
    public void archiveRecords(){
        return;
    }

}
