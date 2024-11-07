package com.healthcare.patient_appointment_system.controller;


import com.healthcare.patient_appointment_system.entity.Appointment;
import com.healthcare.patient_appointment_system.entity.Doctor;
import com.healthcare.patient_appointment_system.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping("/{doctorId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Appointment bookAppointment(@PathVariable Long doctorId, @RequestBody Appointment appointment) {
        appointment.setDoctor(new Doctor(doctorId));
        return appointmentRepository.save(appointment);
    }

    @GetMapping("/available")
    public List<Appointment> getAvailableAppointments() {
        return appointmentRepository.findAll();
    }
}

