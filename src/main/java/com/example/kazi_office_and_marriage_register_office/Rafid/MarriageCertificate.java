package com.example.kazi_office_and_marriage_register_office.Rafid;

import com.example.kazi_office_and_marriage_register_office.MarriageApplication;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageCertificate implements Serializable {
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

    public String getMarriageId() {
        return marriageId;
    }

    public String getCertificateNo() {
        return certificateNo;
    }
}
