package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T13_ORDER_STATUS")
@Data
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C13_ORDER_STATUS_ID")
    private Long id;

    @Column(name = "C13_ORDER_STATUS_DESC")
    private String description;
}