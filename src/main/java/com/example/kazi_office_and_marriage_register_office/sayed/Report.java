package com.example.kazi_office_and_marriage_register_office.sayed;

import java.time.LocalDate;

public class Report {
    private String reportId;
    private String reportTitle;
    private String reportType;
    private LocalDate generatedDate;
    private String generatedBy;
    private LocalDate startDate;
    private LocalDate endDate;
    private int totalRecords;
    private String reportStatus;

    public Report(String reportId, String reportTitle, String reportType, LocalDate generatedDate, String generatedBy, LocalDate startDate, LocalDate endDate, int totalRecords, String reportStatus) {
        this.reportId = reportId;
        this.reportTitle = reportTitle;
        this.reportType = reportType;
        this.generatedDate = generatedDate;
        this.generatedBy = generatedBy;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalRecords = totalRecords;
        this.reportStatus = reportStatus;
    }

    public Report() {
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }


    @Override
    public String toString() {
        return "Report{" +
                "reportId='" + reportId + '\'' +
                ", reportTitle='" + reportTitle + '\'' +
                ", reportType='" + reportType + '\'' +
                ", generatedDate=" + generatedDate +
                ", generatedBy='" + generatedBy + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalRecords=" + totalRecords +
                ", reportStatus='" + reportStatus + '\'' +
                '}';
    }

    public boolean generateReport() {
        return false;
    }

    public boolean viewReport() {
        return false;
    }

    public boolean exportReport() {
        return false;
    }

    public boolean printReport() {
        return false;
    }

    public boolean filterByDate() {
        return false;
    }

    public String getReportSummary() {
        return null;
    }
}
