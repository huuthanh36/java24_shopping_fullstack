package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;

import lombok.Data;
import java.util.List;

@Entity
@Table(name = "T01_ITEM")
@Data

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_ITEM_ID")
    private Long id;

    @Column(name = "C01_ITEM_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "C01_ITEM_GROUP_ID")
    private ItemGroup itemGroup;

    @Column(name = "C01_COLOR")
    private String color;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemDetail> itemDetails;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<Gallery> gallery;
}
