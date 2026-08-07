package com.example.kazi_office_and_marriage_register_office.yasin;

import com.example.kazi_office_and_marriage_register_office.appendableObjectOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

public class CorrectionRequest implements Serializable {
    private String requestId;
    private String applicationId;
    private String correctionType;
    private String reason;
    private String correctInformation;
    private String documentName;
    private String status;

    public CorrectionRequest(String requestId, String applicationId, String correctionType, String reason, String correctInformation, String documentName, String status) {
        this.requestId = requestId;
        this.applicationId = applicationId;
        this.correctionType = correctionType;
        this.reason = reason;
        this.correctInformation = correctInformation;
        this.documentName = documentName;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getCorrectionType() {
        return correctionType;
    }

    public void setCorrectionType(String correctionType) {
        this.correctionType = correctionType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCorrectInformation() {
        return correctInformation;
    }

    public void setCorrectInformation(String correctInformation) {
        this.correctInformation = correctInformation;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CorrectionRequest{" +
                "requestId='" + requestId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", correctionType='" + correctionType + '\'' +
                ", reason='" + reason + '\'' +
                ", correctInformation='" + correctInformation + '\'' +
                ", documentName='" + documentName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static String generateRequestId() {
        Random r = new Random();
        return "CR" + LocalDate.now().getYear()
                + String.format("%04d", r.nextInt(10000));
    }

    public static <T> void saveBinaryFile(String pathName, T object) {

        try {
            File f = new File(pathName);

            FileOutputStream fos;
            ObjectOutputStream oos;

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
            e.printStackTrace();
        }
    }
}
