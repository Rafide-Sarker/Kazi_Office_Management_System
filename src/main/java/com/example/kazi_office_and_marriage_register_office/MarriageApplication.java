package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;

public class MarriageApplication {
    private String applicationID, status;
    private LocalDate applicationDate;

    public MarriageApplication(String applicationID, String status, LocalDate applicationDate) {
        this.applicationID = applicationID;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public MarriageApplication() {
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
