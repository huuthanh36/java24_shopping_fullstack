package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "T08_GALLERY")
@Data
public class Gallery {
    @Id
    @Column(name = "C08_IMAGE_PATH")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "C08_ITEM_ID")
    private Item item;
}
