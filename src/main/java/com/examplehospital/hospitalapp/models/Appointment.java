package com.examplehospital.hospitalapp.models;

import com.examplehospital.hospitalapp.types.AppointmentStatus;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private int appointment_Id;

    @Column(name = "patient")
    private int patient;

    @Column(name = "appointment_time")
    private Timestamp appointmentTime;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "hospital_address")
    private String hospitalAddress;

    @Column(name = "appointment_status")
    private AppointmentStatus appointmentStatus;

    @Column(name = "hospital_rating")
    private int hospitalRating;

    public Appointment() {
    }

    public Appointment(int appointment_Id, int patient, Timestamp appointmentTime, String hospitalName, String hospitalAddress, AppointmentStatus appointmentStatus, int hospitalRating) {
        this.appointment_Id = appointment_Id;
        this.patient = patient;
        this.appointmentTime = appointmentTime;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.appointmentStatus = appointmentStatus;
        this.hospitalRating = hospitalRating;
    }


    public int getAppointment_Id() {
        return appointment_Id;
    }

    public void setAppointment_Id(int appointment_Id) {
        this.appointment_Id = appointment_Id;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
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

    public AppointmentStatus getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
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
                ", patient=" + patient +
                ", appointmentTime=" + appointmentTime +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", appointmentStatus=" + appointmentStatus +
                ", hospitalRating=" + hospitalRating +
                '}';
    }
}
