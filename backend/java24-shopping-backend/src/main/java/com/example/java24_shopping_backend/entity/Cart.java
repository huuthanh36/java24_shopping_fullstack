package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "T23_CART")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C23_CART_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "C23_CUSTOMER_ID")
    private Customer customer;

    @Column(name = "C23_DATE_CREATED")
    private LocalDateTime dateCreated;
}
