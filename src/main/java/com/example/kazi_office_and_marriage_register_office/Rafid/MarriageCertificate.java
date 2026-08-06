package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.MarriageApplication;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageCertificate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String certificateNo;
    private String registrationNo;
    private String marriageId;

    private String brideName;
    private String groomName;

    private long brideNid;
    private long groomNid;

    private LocalDate brideDob;
    private LocalDate groomDob;

    private String brideAddress;
    private String groomAddress;

    private String witness1;
    private String witness2;

    private LocalDate marriageDate;
    private String registeredBy;

    public MarriageCertificate(
            String certificateNo,
            String registrationNo,
            String marriageId,
            MarriageApplication app,
            String registeredBy,
            LocalDate marriageDate) {

        this.certificateNo = certificateNo;
        this.registrationNo = registrationNo;
        this.marriageId = marriageId;

        this.brideName = app.getFullNameBride();
        this.groomName = app.getFullNameGroom();

        this.brideNid = app.getNidBride();
        this.groomNid = app.getNidGroom();

        this.brideDob = app.getDobBride();
        this.groomDob = app.getDobGroom();

        this.brideAddress = app.getAddressBride();
        this.groomAddress = app.getAddressGroom();

        this.witness1 = app.getWitness1();
        this.witness2 = app.getWitness2();

        this.marriageDate = marriageDate;
        this.registeredBy = registeredBy;
    }

    public MarriageCertificate() {
    }

    public String getMarriageId() {
        return marriageId;
    }

    public String getCertificateNo() {
        return certificateNo;
    }
    public String getBrideName() {
        return brideName;
    }

    public String getGroomName() {
        return groomName;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public void setMarriageId(String marriageId) {
        this.marriageId = marriageId;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public long getBrideNid() {
        return brideNid;
    }

    public void setBrideNid(long brideNid) {
        this.brideNid = brideNid;
    }

    public long getGroomNid() {
        return groomNid;
    }

    public void setGroomNid(long groomNid) {
        this.groomNid = groomNid;
    }

    public LocalDate getBrideDob() {
        return brideDob;
    }

    public void setBrideDob(LocalDate brideDob) {
        this.brideDob = brideDob;
    }

    public LocalDate getGroomDob() {
        return groomDob;
    }

    public void setGroomDob(LocalDate groomDob) {
        this.groomDob = groomDob;
    }

    public String getBrideAddress() {
        return brideAddress;
    }

    public void setBrideAddress(String brideAddress) {
        this.brideAddress = brideAddress;
    }

    public String getGroomAddress() {
        return groomAddress;
    }

    public void setGroomAddress(String groomAddress) {
        this.groomAddress = groomAddress;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public String getWitness2() {
        return witness2;
    }

    public void setWitness2(String witness2) {
        this.witness2 = witness2;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    @Override
    public String toString() {
        return "MarriageCertificate{" +
                "certificateNo='" + certificateNo + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", marriageId='" + marriageId + '\'' +
                ", brideName='" + brideName + '\'' +
                ", groomName='" + groomName + '\'' +
                ", brideNid=" + brideNid +
                ", groomNid=" + groomNid +
                ", brideDob=" + brideDob +
                ", groomDob=" + groomDob +
                ", brideAddress='" + brideAddress + '\'' +
                ", groomAddress='" + groomAddress + '\'' +
                ", witness1='" + witness1 + '\'' +
                ", witness2='" + witness2 + '\'' +
                ", marriageDate=" + marriageDate +
                ", registeredBy='" + registeredBy + '\'' +
                '}';
    }
}
