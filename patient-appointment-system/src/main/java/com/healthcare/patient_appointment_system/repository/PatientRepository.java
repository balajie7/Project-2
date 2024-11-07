package com.healthcare.patient_appointment_system.repository;

import com.healthcare.patient_appointment_system.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByEmail(String email);
}
