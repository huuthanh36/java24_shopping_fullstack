package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

@Embeddable
@Data
class ShoppingCartKey implements Serializable {
    @Column(name = "C23_CART_ID")
    private Long cartId;

    @Column(name = "C23_ITEM_ID")
    private Long itemId;
}

@Entity
@Table(name = "T23_SHOPPING_CART")
@Data
public class ShoppingCart {
    @EmbeddedId
    private ShoppingCartKey id = new ShoppingCartKey();

    @ManyToOne
    @MapsId("cartId")
    @JoinColumn(name = "C23_CART_ID")
    private Cart cart;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "C23_ITEM_ID")
    private Item item;

    @Column(name = "C23_AMOUNT")
    private Integer amount;

    @Column(name = "C23_DATE_ADDING")
    private LocalDateTime dateAdding;

    @Column(name = "C23_DATE_REMOVING")
    private LocalDateTime dateRemoving;
}