package com.healthcare.patient_appointment_system.repository;


import com.healthcare.patient_appointment_system.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
