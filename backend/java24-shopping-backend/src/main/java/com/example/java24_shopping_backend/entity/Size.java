package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "T02_SIZE")
@Data
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C02_SIZE_ID")
    private Long id;

    @Column(name = "C02_SIZE_NAME")
    private String name;

    @Column(name = "C02_GENDER")
    private Integer gender;

    @Column(name = "C02_SIZE_DESC")
    private String description;

    @OneToMany(mappedBy = "size", cascade = CascadeType.ALL)
    private List<ItemDetail> itemDetails;
}
