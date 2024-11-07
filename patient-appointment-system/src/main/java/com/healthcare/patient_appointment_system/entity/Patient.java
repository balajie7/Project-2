package com.healthcare.patient_appointment_system.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    private String password;

    @NotEmpty(message = "Contact number is required")
    private String contactNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty(message = "Name cannot be empty") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name cannot be empty") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Password cannot be empty") String getPassword() {
        return password;
    }

    public void setPassword(@NotEmpty(message = "Password cannot be empty") String password) {
        this.password = password;
    }

    public @Email(message = "Invalid email") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Invalid email") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Contact number is required") String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(@NotEmpty(message = "Contact number is required") String contactNumber) {
        this.contactNumber = contactNumber;
    }

}

