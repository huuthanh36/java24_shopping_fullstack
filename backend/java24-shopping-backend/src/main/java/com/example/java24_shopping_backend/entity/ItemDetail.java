package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Embeddable
@Data
class ItemDetailKey implements Serializable {
    @Column(name = "C03_ITEM_ID")
    private Long itemId;

    @Column(name = "C03_SIZE_ID")
    private Long sizeId;
}

@Entity
@Table(name = "T03_ITEM_DETAIL")
@Data
public class ItemDetail {
    @EmbeddedId
    private ItemDetailKey id = new ItemDetailKey();

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "C03_ITEM_ID")
    private Item item;

    @ManyToOne
    @MapsId("sizeId")
    @JoinColumn(name = "C03_SIZE_ID")
    private Size size;

    @Column(name = "C03_SALES_PRICE")
    private Double salesPrice;

    @Column(name = "C03_AMOUNT")
    private Integer amount;
}
