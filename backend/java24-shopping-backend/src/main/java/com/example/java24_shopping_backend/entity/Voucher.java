package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "T19_VOUCHER")
@Data
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C19_VOUCHER_ID")
    private Long id;

    @Column(name = "C19_REDUCING_MONEY")
    private Double reducingMoney;

    @Column(name = "C19_REDUCING_IN_PERCENT")
    private Double reducingPercent;

    @Column(name = "C19_DATE_START")
    private LocalDate dateStart;

    @Column(name = "C19_DATE_END")
    private LocalDate dateEnd;

    @Column(name = "C19_VOUCHER_STATUS")
    private String status;
}
