//package com.healthcare.patient_appointment_system.repo;
//
//import com.healthcare.patient_appointment_system.entity.Patient;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import static org.junit.jupiter.api.Assertions.*;
//import com.healthcare.patient_appointment_system.repository.PatientRepository;
//@DataJpaTest
//public class PatientRepositoryTest {
//
//    @Autowired
//    private PatientRepository patientRepository;
//
//    @Test
//    void testSaveAndFindPatient() {
//        Patient savedPatient = patientRepository.save(new Patient("Jane Doe", "jane@example.com", "password123", "0987654321", "No medical history"));
//
//        Patient foundPatient = patientRepository.findByEmail("jane@example.com").orElseThrow();
//
//        assertNotNull(foundPatient);
//        assertEquals("Jane Doe", foundPatient.getName());
//        assertEquals("jane@example.com", foundPatient.getEmail());
//    }
//}
//
