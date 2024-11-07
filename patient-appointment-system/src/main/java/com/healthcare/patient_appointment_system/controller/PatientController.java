package com.healthcare.patient_appointment_system.controller;


import com.healthcare.patient_appointment_system.entity.Patient;

import com.healthcare.patient_appointment_system.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient registerPatient(@RequestBody @Valid Patient patient) {
        return patientRepository.save(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody @Valid Patient patient) {
        patient.setId(id);
        return patientRepository.save(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
    }
}

