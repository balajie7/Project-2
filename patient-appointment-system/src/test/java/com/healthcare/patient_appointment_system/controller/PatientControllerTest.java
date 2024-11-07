//package com.healthcare.patient_appointment_system.controller;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.beans.factory.annotation.Autowired;
//import static org.mockito.Mockito.when;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.http.MediaType;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(PatientController.class)
//public class PatientControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private PatientService patientService;
//
//    @InjectMocks
//    private PatientController patientController;
//
//    private Patient samplePatient;
//
//    @BeforeEach
//    void setUp() {
//        samplePatient = new Patient("John Doe", "john@example.com", "password123", "1234567890", "No allergies");
//    }
//
//    @Test
//    void testRegisterPatient() throws Exception {
//        // Given that a Patient is created successfully
//        when(patientService.registerPatient(samplePatient)).thenReturn(samplePatient);
//
//        // Perform the request and assert the response
//        mockMvc.perform(post("/api/patients/register")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{ \"name\": \"John Doe\", \"email\": \"john@example.com\", \"password\": \"password123\", \"contact\": \"1234567890\", \"medicalHistory\": \"No allergies\" }"))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.name").value("John Doe"))
//                .andExpect(jsonPath("$.email").value("john@example.com"));
//    }
//}
//
