package com.example.kazi_office_and_marriage_register_office;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String appointmentId;
    private LocalDate appointmentDate;
    private LocalTime time;
    private Boolean status;

    public Appointment(String appointmentId, LocalDate appointmentDate, LocalTime time, Boolean status) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.time = time;
        this.status = status;
    }

    public Appointment() {
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", time=" + time +
                ", status=" + status +
                '}';
    }

    public void schedule(){
        return;
    }

    public void update(){
        return;
    }
}
