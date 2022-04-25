package com.examplehospital.hospitalapp.repositories;

import com.examplehospital.hospitalapp.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment> getAppointmentsByPatient(int id);

}
