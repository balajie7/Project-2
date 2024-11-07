package com.healthcare.patient_appointment_system.controller;


import com.healthcare.patient_appointment_system.entity.Medication;
import com.healthcare.patient_appointment_system.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationRepository medicationRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medication addMedication(@RequestBody @Valid Medication medication) {
        return medicationRepository.save(medication);
    }

    @GetMapping
    public List<Medication> getMedications() {
        return medicationRepository.findAll();
    }

    @PutMapping("/{id}")
    public Medication updateMedication(@PathVariable Long id, @RequestBody @Valid Medication medication) {
        medication.setId(id);
        return medicationRepository.save(medication);
    }

    @DeleteMapping("/{id}")
    public void deleteMedication(@PathVariable Long id) {
        medicationRepository.deleteById(id);
    }
}

