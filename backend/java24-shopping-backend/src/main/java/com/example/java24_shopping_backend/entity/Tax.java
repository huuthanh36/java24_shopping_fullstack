package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "T22_TAX")
@Data
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C22_TAX_ID")
    private Long id;

    @Column(name = "C22_TAX_IN_PERCENT")
    private Double taxPercent;

    @Column(name = "C22_TOTAL_OF_MONEY")
    private Double totalMoney;

    @Column(name = "C22_DATE_SUBMIT")
    private LocalDate dateSubmit;

    @Column(name = "C22_DATE_FROM")
    private LocalDate dateFrom;

    @Column(name = "C22_DATE_UNTIL")
    private LocalDate dateUntil;

    @Column(name = "C22_TAX_PAYER_ID")
    private String taxPayerId;
}