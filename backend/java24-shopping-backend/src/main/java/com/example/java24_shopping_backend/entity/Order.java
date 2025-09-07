package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "T09_ORDER")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C09_ORDER_ID")
    private Long id;

    @Column(name = "C09_ORDER_TIME")
    private LocalDateTime orderTime;

    @ManyToOne
    @JoinColumn(name = "C09_PAYMENT_METHOD_ID")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "C09_CUSTOMER_ID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "C09_DELIVERY_ADDRESS_ID")
    private DeliveryAddress deliveryAddress;

    @ManyToOne
    @JoinColumn(name = "C09_EMPLOYEE_ID")
    private Employee employee;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderStatusDetail> orderStatusDetails;
}