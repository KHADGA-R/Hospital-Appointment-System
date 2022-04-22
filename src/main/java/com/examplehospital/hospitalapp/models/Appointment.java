package com.examplehospital.hospitalapp.models;

import java.sql.Timestamp;

public class Appointment {

    private int appointment_Id;
    private Timestamp appointmentTime;
    private String hospitalName;
    private String hospitalAddress;
    private AppointmentStatus reservationStatus;
    private int hospitalRating;

    public Appointment(int appointment_Id, Timestamp appointmentTime, String hospitalName, String hospitalAddress, AppointmentStatus reservationStatus, int hospitalRating) {
        this.appointment_Id = appointment_Id;
        this.appointmentTime = appointmentTime;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.reservationStatus = reservationStatus;
        this.hospitalRating = hospitalRating;
    }

    public int getAppointment_Id() {
        return appointment_Id;
    }

    public void setAppointment_Id(int appointment_Id) {
        this.appointment_Id = appointment_Id;
    }

    public Timestamp getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Timestamp appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public AppointmentStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(AppointmentStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public int getHospitalRating() {
        return hospitalRating;
    }

    public void setHospitalRating(int hospitalRating) {
        this.hospitalRating = hospitalRating;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointment_Id=" + appointment_Id +
                ", appointmentTime=" + appointmentTime +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", reservationStatus=" + reservationStatus +
                ", hospitalRating=" + hospitalRating +
                '}';
    }
}
