package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
class CartLaterOnKey implements Serializable {
    @Column(name = "C24_CUSTOMER_ID")
    private Long customerId;

    @Column(name = "C24_ITEM_ID")
    private Long itemId;
}

@Entity
@Table(name = "T24_CART_LATER_ON")
@Data
public class CartLaterOn {
    @EmbeddedId
    private CartLaterOnKey id = new CartLaterOnKey();

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "C24_CUSTOMER_ID")
    private Customer customer;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "C24_ITEM_ID")
    private Item item;

    @Column(name = "C24_AMOUNT")
    private Integer amount;
}