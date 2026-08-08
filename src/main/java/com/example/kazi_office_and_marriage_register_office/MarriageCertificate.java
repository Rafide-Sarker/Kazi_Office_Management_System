package com.example.kazi_office_and_marriage_register_office;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MarriageCertificate {
    private String status, certificateId;
    private LocalDate issueDate;
    private String applicationId;

    public MarriageCertificate(String status, String certificateId, LocalDate issueDate , String applicationId) {
        this.status = status;
        this.certificateId = certificateId;
        this.issueDate = issueDate;
        this.applicationId = applicationId;
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

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public String toString() {
        return "MarriageCertificate{" +
                "status='" + status + '\'' +
                ", certificateId='" + certificateId + '\'' +
                ", issueDate=" + issueDate +
                ", applicationId='" + applicationId + '\'' +
                '}';
    }

    public static ArrayList<MarriageCertificate> readAllCertificates(String pathName){
        ArrayList<MarriageCertificate> certificateList = new ArrayList<>();

        try{
            File f = new File(pathName);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true){
                MarriageCertificate certificate = (MarriageCertificate) ois.readObject();
                certificateList.add(certificate);
            }
        }
        catch (Exception e){
            //
        }
        return certificateList;
    }

    public void generate(){
        return;
    }

    public static MarriageCertificate searchCertificateByApplicationId(
            String pathName, String applicationId) {

        ArrayList<MarriageCertificate> list = readAllCertificates(pathName);

        System.out.println("Searching for: " + applicationId);

        for (MarriageCertificate certificate : list) {
            System.out.println("Stored Application ID: " + certificate.getApplicationId());

            if (certificate.getApplicationId().equals(applicationId)) {
                System.out.println("MATCH FOUND");
                return certificate;
            }
        }

        System.out.println("NO MATCH FOUND");
        return null;
    }

    public void download(){
        return;
    }
}
