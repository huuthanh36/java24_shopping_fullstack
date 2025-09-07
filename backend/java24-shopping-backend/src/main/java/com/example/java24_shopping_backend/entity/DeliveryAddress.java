package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T18_DELIVERY_ADDRESS")
@Data
public class DeliveryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C18_DELIVERY_ADDRESS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "C18_CUSTOMER_ID")
    private Customer customer;

    @Column(name = "C18_RECEIVER_NAME")
    private String receiverName;

    @Column(name = "C18_ADDRESS")
    private String address;
}
