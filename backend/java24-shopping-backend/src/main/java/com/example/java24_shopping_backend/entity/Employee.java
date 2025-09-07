package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T16_EMPLOYEE")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C16_EMPLOYEE_ID")
    private Long id;

    @Column(name = "C16_EMPLOYEE_NAME")
    private String name;

    @Column(name = "C16_EMPLOYEE_EMAIL")
    private String email;

    @Column(name = "C16_EMPLOYEE_ADDRESS")
    private String address;

    @Column(name = "C16_EMPLOYEE_PHONE")
    private String phone;

    @Column(name = "C16_EMPLOYEE_PASSWORD")
    private String password;

    @Column(name = "C16_GMAIL_TOKEN")
    private String gmailToken;

    @ManyToOne
    @JoinColumn(name = "C16_DEPARTMENT_ID")
    private Department department;
}