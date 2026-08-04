package com.example.kazi_office_and_marriage_register_office.Rafid;

import java.time.LocalDate;

public class marriageRecords {
    private String recordId, registrationNo, status;
    private LocalDate registrationDate,MarriageDate;

    public marriageRecords(String recordId, String registrationNo, String status, LocalDate registrationDate, LocalDate marriageDate) {
        this.recordId = recordId;
        this.registrationNo = registrationNo;
        this.status = status;
        this.registrationDate = registrationDate;
        MarriageDate = marriageDate;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getMarriageDate() {
        return MarriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        MarriageDate = marriageDate;
    }

    @Override
    public String toString() {
        return "marriageRecords{" +
                "recordId='" + recordId + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", status='" + status + '\'' +
                ", registrationDate=" + registrationDate +
                ", MarriageDate=" + MarriageDate +
                '}';
    }

    public void storeRecord(){
        return;
    }
    public void updateRecord(){
        return;
    }
    public void searchRecord(){
        return;
    }
    public void archiveRecord(){
        return;
    }


}
