package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T06_PROVIDER")
@Data
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C06_PROVIDER_ID")
    private Long id;

    @Column(name = "C06_PROVIDER_NAME")
    private String name;

    @Column(name = "C06_PROVIDER_TAX")
    private String tax;
}
