package com.examplehospital.hospitalapp.services;

import com.examplehospital.hospitalapp.models.Appointment;
import com.examplehospital.hospitalapp.types.AppointmentStatus;
import com.examplehospital.hospitalapp.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private UserService userService;

    public AppointmentService(){

    }

    public AppointmentService(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }

    public void createAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }

    public List<Appointment>getPendingAppointment(){return filterAppointment(appointmentRepository.findAll(), AppointmentStatus.PENDING);
    }

    public List<Appointment>getServedAppointment(){return  filterAppointment(appointmentRepository.findAll(), AppointmentStatus.SERVED);
    }

    public List<Appointment>getAppointmentByPatient(int id){ return appointmentRepository.getAppointmentsByPatient(id);
    }

    public List<Appointment>getAppointmentByPatientAndPending(int id){ return filterAppointment(appointmentRepository.getAppointmentsByPatient(id), AppointmentStatus.PENDING);
    }

    public List<Appointment>getAppointmentByPatientAndServed(int id){ return filterAppointment(appointmentRepository.getAppointmentsByPatient(id), AppointmentStatus.SERVED);
    }

    public Appointment getAppointmentById(int id){
        return appointmentRepository.getById(id);
    }

    public void approvedAppointment(Appointment appointment){
        appointment.setAppointmentStatus(AppointmentStatus.APPROVED);
        appointmentRepository.save(appointment);
    }

    public void denyAppointment(Appointment appointment){
        appointment.setAppointmentStatus(AppointmentStatus.DENIED);
        appointmentRepository.save(appointment);
    }

    public void cancelAppointment(Appointment appointment){
        appointment.setAppointmentStatus(AppointmentStatus.CANCELED);
        appointmentRepository.save(appointment);
    }

    public void servedAppointment(Appointment appointment){
        appointment.setAppointmentStatus(AppointmentStatus.SERVED);
        appointmentRepository.save(appointment);
    }

    public void updateAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Appointment appointment){
        appointmentRepository.delete(appointment);
    }

    public List<Appointment> filterAppointment(List<Appointment> all, AppointmentStatus type) {
        List<Appointment>newList = new ArrayList<>();
        for(Appointment item : newList){
            if(item.getAppointmentStatus() == type)
                newList.add(item);
        }
        return newList;
    }

}
