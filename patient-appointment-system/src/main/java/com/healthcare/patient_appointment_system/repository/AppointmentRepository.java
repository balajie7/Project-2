package com.healthcare.patient_appointment_system.repository;

import com.healthcare.patient_appointment_system.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
