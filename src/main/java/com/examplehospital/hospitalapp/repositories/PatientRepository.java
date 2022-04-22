package com.examplehospital.hospitalapp.repositories;

import com.examplehospital.hospitalapp.models.Appointment;
import com.examplehospital.hospitalapp.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient getPatientByEmailAndPassword(String email, String password);
}