package com.example.kazi_office_and_marriage_register_office.sayed;

import java.time.LocalDate;

public class Refund {
    private String refundId;
    private double refundAmount;
    private String refundReason;
    private LocalDate refundDate;
    private String refundStatus;

    public Refund(String refundId, double refundAmount, String refundReason, LocalDate refundDate, String refundStatus) {
        this.refundId = refundId;
        this.refundAmount = refundAmount;
        this.refundReason = refundReason;
        this.refundDate = refundDate;
        this.refundStatus = refundStatus;
    }

    public Refund() {
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public LocalDate getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(LocalDate refundDate) {
        this.refundDate = refundDate;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId='" + refundId + '\'' +
                ", refundAmount=" + refundAmount +
                ", refundReason='" + refundReason + '\'' +
                ", refundDate=" + refundDate +
                ", refundStatus='" + refundStatus + '\'' +
                '}';
    }
    public boolean processRefund() {
        return false;
    }

    public boolean approveRefund() {
        return false;
    }
}
