package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;

public class MarriageApplication {
    private String applicationID, status;
    private LocalDate applicationDate;
    private Documents documents;// composition
    private String fullNameBride,fullNameGroom,fatherNameGroom,fatherNameBride,motherNameGroom,motherNameBride,addressGroom,addressBride,emailGroom,emailBride;
    private Integer nidGroom,nidBride , phoneNumber;
    private LocalDate dobGroom,dobBride;

    public MarriageApplication(String applicationID, String status, LocalDate applicationDate, Documents documents, String fullNameBride, String fullNameGroom, String fatherNameGroom, String fatherNameBride, String motherNameGroom, String motherNameBride, String addressGroom, String addressBride, String emailGroom, String emailBride, Integer nidGroom, Integer nidBride, Integer phoneNumber, LocalDate dobGroom, LocalDate dobBride) {
        this.applicationID = applicationID;
        this.status = status;
        this.applicationDate = applicationDate;
        this.documents = documents;
        this.fullNameBride = fullNameBride;
        this.fullNameGroom = fullNameGroom;
        this.fatherNameGroom = fatherNameGroom;
        this.fatherNameBride = fatherNameBride;
        this.motherNameGroom = motherNameGroom;
        this.motherNameBride = motherNameBride;
        this.addressGroom = addressGroom;
        this.addressBride = addressBride;
        this.emailGroom = emailGroom;
        this.emailBride = emailBride;
        this.nidGroom = nidGroom;
        this.nidBride = nidBride;
        this.phoneNumber = phoneNumber;
        this.dobGroom = dobGroom;
        this.dobBride = dobBride;
    }

    public String getFullNameBride() {
        return fullNameBride;
    }

    public void setFullNameBride(String fullNameBride) {
        this.fullNameBride = fullNameBride;
    }

    public String getFullNameGroom() {
        return fullNameGroom;
    }

    public void setFullNameGroom(String fullNameGroom) {
        this.fullNameGroom = fullNameGroom;
    }

    public String getFatherNameGroom() {
        return fatherNameGroom;
    }

    public void setFatherNameGroom(String fatherNameGroom) {
        this.fatherNameGroom = fatherNameGroom;
    }

    public String getFatherNameBride() {
        return fatherNameBride;
    }

    public void setFatherNameBride(String fatherNameBride) {
        this.fatherNameBride = fatherNameBride;
    }

    public String getMotherNameGroom() {
        return motherNameGroom;
    }

    public void setMotherNameGroom(String motherNameGroom) {
        this.motherNameGroom = motherNameGroom;
    }

    public String getMotherNameBride() {
        return motherNameBride;
    }

    public void setMotherNameBride(String motherNameBride) {
        this.motherNameBride = motherNameBride;
    }

    public String getAddressGroom() {
        return addressGroom;
    }

    public void setAddressGroom(String addressGroom) {
        this.addressGroom = addressGroom;
    }

    public String getAddressBride() {
        return addressBride;
    }

    public void setAddressBride(String addressBride) {
        this.addressBride = addressBride;
    }

    public String getEmailGroom() {
        return emailGroom;
    }

    public void setEmailGroom(String emailGroom) {
        this.emailGroom = emailGroom;
    }

    public String getEmailBride() {
        return emailBride;
    }

    public void setEmailBride(String emailBride) {
        this.emailBride = emailBride;
    }

    public Integer getNidGroom() {
        return nidGroom;
    }

    public void setNidGroom(Integer nidGroom) {
        this.nidGroom = nidGroom;
    }

    public Integer getNidBride() {
        return nidBride;
    }

    public void setNidBride(Integer nidBride) {
        this.nidBride = nidBride;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDobGroom() {
        return dobGroom;
    }

    public void setDobGroom(LocalDate dobGroom) {
        this.dobGroom = dobGroom;
    }

    public LocalDate getDobBride() {
        return dobBride;
    }

    public void setDobBride(LocalDate dobBride) {
        this.dobBride = dobBride;
    }

    @Override
    public String toString() {
        return "MarriageApplication{" +
                "applicationID='" + applicationID + '\'' +
                ", status='" + status + '\'' +
                ", applicationDate=" + applicationDate +
                ", documents=" + documents +
                ", fullNameBride='" + fullNameBride + '\'' +
                ", fullNameGroom='" + fullNameGroom + '\'' +
                ", fatherNameGroom='" + fatherNameGroom + '\'' +
                ", fatherNameBride='" + fatherNameBride + '\'' +
                ", motherNameGroom='" + motherNameGroom + '\'' +
                ", motherNameBride='" + motherNameBride + '\'' +
                ", addressGroom='" + addressGroom + '\'' +
                ", addressBride='" + addressBride + '\'' +
                ", emailGroom='" + emailGroom + '\'' +
                ", emailBride='" + emailBride + '\'' +
                ", nidGroom=" + nidGroom +
                ", nidBride=" + nidBride +
                ", phoneNumber=" + phoneNumber +
                ", dobGroom=" + dobGroom +
                ", dobBride=" + dobBride +
                '}';
    }

    public MarriageApplication(){
        this.documents = new Documents();
    }

    public MarriageApplication(String applicationID, String status, LocalDate applicationDate) {
        this.applicationID = applicationID;
        this.status = status;
        this.applicationDate = applicationDate;
        this.documents = new Documents();
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Documents getDocuments() {
        return documents;
    }

    public void setDocuments(Documents documents) {
        this.documents = documents;
    }

    public void updateStatus(){
        return;
    }

    public void submit(){
        return;
    }

}
