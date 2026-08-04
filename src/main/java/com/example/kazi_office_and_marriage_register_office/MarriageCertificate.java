package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;
import java.time.LocalTime;

public class MarriageCertificate {
    private String status, certificateId;
    private LocalDate issueDate;

    public MarriageCertificate(String status, String certificateId, LocalDate issueDate) {
        this.status = status;
        this.certificateId = certificateId;
        this.issueDate = issueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "MarriageCertificate{" +
                "status='" + status + '\'' +
                ", certificateId='" + certificateId + '\'' +
                ", issueDate=" + issueDate +
                '}';
    }

    public void generate(){
        return;
    }
    public void download(){
        return;
    }

}
