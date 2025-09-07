package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T10_BILL")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C10_BILL_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "C10_ORDER_ID")
    private Order order;

    @Column(name = "C10_DELIVERY_FEE")
    private Double deliveryFee;

    @ManyToOne
    @JoinColumn(name = "C10_VOUCHER_ID")
    private Voucher voucher;

    @Column(name = "C10_TOTAL_OF_MONEY")
    private Double totalMoney;
}