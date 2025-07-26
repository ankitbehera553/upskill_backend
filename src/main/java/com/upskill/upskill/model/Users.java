package com.upskill.upskill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Column(name = "first_name", nullable = false)
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @JsonProperty("lastName")
    private String lastName;

    @Id
    @Column(nullable = false, unique = true)
    @JsonProperty("email")
    private String email;

    @Column(nullable = false)
    @JsonProperty("password")
    private String password;

    @Column
    @JsonProperty("department")
    private String department;
    
    @Column
    @JsonProperty("role")
    private String role;

    // Constructors
    public Users() {}

    public Users(String firstName, String lastName, String email, String password, String department, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
        this.role = role;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", department='" + department + '\'' +
               ", role='" + role + '\'' +
               '}';
    }

}

