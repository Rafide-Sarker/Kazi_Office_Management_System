package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;

public class MarriageApplication {
    private String applicationID, status;
    private LocalDate applicationDate;
    private Documents documents;// composition

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

    @Override
    public String toString() {
        return "MarriageApplication{" +
                "applicationID='" + applicationID + '\'' +
                ", status='" + status + '\'' +
                ", applicationDate=" + applicationDate +
                '}';
    }

    public void updateStatus(){
        return;
    }

    public void submit(){
        return;
    }

}
