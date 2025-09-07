package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T20_ROLE")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C20_ROLE_ID")
    private Long id;

    @Column(name = "C20_ROLE_NAME")
    private String name;
}