package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;

public class Documents {

    private String documentID;
    private String documentType;
    private LocalDate uploadDate;
    private String verificationStatus;

    public Documents(String documentID, String documentType, LocalDate uploadDate, String verificationStatus) {
        this.documentID = documentID;
        this.documentType = documentType;
        this.uploadDate = uploadDate;
        this.verificationStatus = verificationStatus;
    }

    public Documents() {

    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "documentID=" + documentID +
                ", documentType='" + documentType + '\'' +
                ", uploadDate=" + uploadDate +
                ", verificationStatus='" + verificationStatus + '\'' +
                '}';
    }

    public void upload() {
        return ;
    }

    public void verify() {
        return;
    }
}
