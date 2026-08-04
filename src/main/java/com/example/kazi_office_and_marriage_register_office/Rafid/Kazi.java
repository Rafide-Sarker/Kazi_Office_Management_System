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

    public String getKaziId() {
        return kaziId;
    }

    public void setKaziId(String kaziId) {
        this.kaziId = kaziId;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
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
        return "Kazi{" +
                "kaziId='" + kaziId + '\'' +
                ", licenseNo='" + licenseNo + '\'' +
                ", officeName='" + officeName + '\'' +
                ", designation='" + designation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Boolean reviewApplication(){
        return null;
    }

    public Boolean verifyBrideInformation(){
        return null;
    }

    public Boolean verifyGroomInformation(){
        return null;
    }

    public Boolean approveMarriage(){
        return null;
    }

    public Boolean rejectApplication(){
        return null;
    }

    public Boolean generateMarriageCertificate(){
        return null;
    }

    public Boolean manageAppointments(){
        return null;
    }

    public Boolean searchMarriageRecords(){
        return null;
    }


}
