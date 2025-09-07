package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T11_PAYMENT_METHOD")
@Data
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C11_PAYMENT_METHOD_ID")
    private Long id;

    @Column(name = "C11_PAYMENT_METHOD_NAME")
    private String name;
}
