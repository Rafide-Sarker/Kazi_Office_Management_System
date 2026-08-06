package com.example.kazi_office_and_marriage_register_office;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

public class Documents implements Serializable {
    private String bridePhoto;
    private String brideDobCertificate;
    private String brideNidCopy;

    private String groomPhoto;
    private String groomDobCertificate;
    private String groomNidCopy;

    private String documentID;
    private String documentType;
    private LocalDate uploadDate;
    private String verificationStatus;

    public Documents(String bridePhoto, String brideDobCertificate, String brideNidCopy, String groomPhoto, String groomDobCertificate, String groomNidCopy, String documentID, String documentType, LocalDate uploadDate, String verificationStatus) {
        this.bridePhoto = bridePhoto;
        this.brideDobCertificate = brideDobCertificate;
        this.brideNidCopy = brideNidCopy;
        this.groomPhoto = groomPhoto;
        this.groomDobCertificate = groomDobCertificate;
        this.groomNidCopy = groomNidCopy;
        this.documentID = documentID;
        this.documentType = documentType;
        this.uploadDate = uploadDate;
        this.verificationStatus = verificationStatus;
    }

    public Documents() {

    }

    public String getBridePhoto() {
        return bridePhoto;
    }

    public void setBridePhoto(String bridePhoto) {
        this.bridePhoto = bridePhoto;
    }

    public String getBrideDobCertificate() {
        return brideDobCertificate;
    }

    public void setBrideDobCertificate(String brideDobCertificate) {
        this.brideDobCertificate = brideDobCertificate;
    }

    public String getBrideNidCopy() {
        return brideNidCopy;
    }

    public void setBrideNidCopy(String brideNidCopy) {
        this.brideNidCopy = brideNidCopy;
    }

    public String getGroomPhoto() {
        return groomPhoto;
    }

    public void setGroomPhoto(String groomPhoto) {
        this.groomPhoto = groomPhoto;
    }

    public String getGroomDobCertificate() {
        return groomDobCertificate;
    }

    public void setGroomDobCertificate(String groomDobCertificate) {
        this.groomDobCertificate = groomDobCertificate;
    }

    public String getGroomNidCopy() {
        return groomNidCopy;
    }

    public void setGroomNidCopy(String groomNidCopy) {
        this.groomNidCopy = groomNidCopy;
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
                "bridePhoto='" + bridePhoto + '\'' +
                ", brideDobCertificate='" + brideDobCertificate + '\'' +
                ", brideNidCopy='" + brideNidCopy + '\'' +
                ", groomPhoto='" + groomPhoto + '\'' +
                ", groomDobCertificate='" + groomDobCertificate + '\'' +
                ", groomNidCopy='" + groomNidCopy + '\'' +
                ", documentID='" + documentID + '\'' +
                ", documentType='" + documentType + '\'' +
                ", uploadDate=" + uploadDate +
                ", verificationStatus='" + verificationStatus + '\'' +
                '}';
    }

    public String getDocumentsID() {
        return documentID;
    }

    public static String generateDocumentsID() {
        Random random = new Random();

        return LocalDate.now().getYear()
                + String.format("%04d", random.nextInt(10000));
    }

    public static <T> void writeBinaryFile(String pathName, T object) {

        try {
            File f = new File(pathName);

            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new appendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(object);
            oos.close();

        } catch (Exception e) {
            //
        }
    }

    public void upload() {
        return ;
    }

    public void verify() {
        return;
    }
}
