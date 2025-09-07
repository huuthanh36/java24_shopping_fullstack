package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T17_DEPARTMENT")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C17_DEPARTMENT_ID")
    private Long id;

    @Column(name = "C17_DEPARTMENT_NAME")
    private String name;
}
