package com.examplehospital.hospitalapp.models.services;

import com.examplehospital.hospitalapp.models.Patient;
import com.examplehospital.hospitalapp.repositories.PatientRepository;

import java.util.List;

public class PatientService {

    private PatientRepository patientRepository;

    public void createPatient(Patient patient){
        patientRepository.save(patient);

    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public Patient getPatientById(int id){
        return patientRepository.getById(id);
    }

    public Patient getPatientByEmailAndPassword(String email, String password){
        return patientRepository.getPatientByEmailAndPassword(email, password);
    }

    public void updatePatient(Patient patient){
        patientRepository.save(patient);
    }

    public  void deletePatient(Patient patient){
        patientRepository.delete(patient);
    }

}
