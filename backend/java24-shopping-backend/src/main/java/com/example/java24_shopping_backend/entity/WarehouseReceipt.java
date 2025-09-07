package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "T04_WAREHOUSE_RECEIPT")
@Data
public class WarehouseReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C04_WHRECEIPT_ID")
    private Long id;

    @Column(name = "C04_WHRECEIPT_TIME")
    private LocalDateTime receiptTime;

    @ManyToOne
    @JoinColumn(name = "C04_EMPLOYEE_ID")
    private Employee employee;
}
