package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T07_ITEM_GROUP")
@Data
public class ItemGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C07_ITEM_GROUP_ID")
    private Long id;

    @Column(name = "C07_ITEM_GROUP_NAME")
    private String name;

    @Column(name = "C07_STATUS")
    private String status;
}