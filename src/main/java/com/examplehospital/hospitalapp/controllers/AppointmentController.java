package com.examplehospital.hospitalapp.controllers;

import com.examplehospital.hospitalapp.models.Appointment;

import com.examplehospital.hospitalapp.services.AppointmentService;
import com.examplehospital.hospitalapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@CrossOrigin("*")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private UserService userService;

    public AppointmentController(){ }

    @Autowired
    public AppointmentController(AppointmentService appointmentService, UserService userService) {
        this.appointmentService = appointmentService;
        this.userService = userService;
    }

    @PostMapping("/")
    @ResponseBody
    public void createAppointment(@RequestBody Appointment appointment){appointmentService.createAppointment(appointment);
    }

    @GetMapping("/")
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/pending")
    public List<Appointment>getPendingAppointments(){
        return appointmentService.getPendingAppointment();
    }

    @GetMapping("/served")
    public List<Appointment> getServedAppointments(){
        return appointmentService.getServedAppointment();
    }

    @GetMapping("/patient/{user_id}")
    public List<Appointment>getAppointmentsByPatient(@PathVariable("user_id") int id){
        return appointmentService.getAppointmentByPatient(id);
    }

    @GetMapping("/patient/pending/{user_id}")
    public List<Appointment>getAppointmentByPatientAndPending(@PathVariable("user_id") int id){
        return appointmentService.getAppointmentByPatientAndPending(id);
    }

    @GetMapping("/patient/served/{user_id}")
    public List<Appointment>getAppointmentByPatientAndServed(@PathVariable("user_id") int id){
        return appointmentService.getAppointmentByPatientAndServed(id);
    }

    @PutMapping("/approve/{id}")
    public void approvedAppointment(@PathVariable("appointment_id") int id){
        Appointment appointment = appointmentService.getAppointmentById(id);
        appointmentService.approvedAppointment(appointment);
    }

    @PutMapping("/deny/{id}")
    public void denyAppointment(@PathVariable("appointment_id") int id){
        Appointment appointment = appointmentService.getAppointmentById(id);
        appointmentService.denyAppointment(appointment);
    }

    @PutMapping("/cancel/{id}")
    public void cancelAppointment(@PathVariable("appointment_id") int id){
        Appointment appointment = appointmentService.getAppointmentById(id);
        appointmentService.cancelAppointment(appointment);
    }

    @PutMapping("/served/{id}")
    public void servedAppointment(@PathVariable("appointment_id") int id){
        Appointment appointment = appointmentService.getAppointmentById(id);
        appointmentService.servedAppointment(appointment);
    }

    @PutMapping("/")
    @ResponseBody
    public void updateAppointment(@RequestBody Appointment appointment){
        appointmentService.updateAppointment(appointment);
    }

    @DeleteMapping("/appointment_id")
    @ResponseBody
    public void deleteAppointment(@PathVariable("appointment_id") int id){
        appointmentService.deleteAppointment(appointmentService.getAppointmentById(id));
    }


}
