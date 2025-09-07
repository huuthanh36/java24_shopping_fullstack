package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
class OrderDetailKey implements Serializable {
    @Column(name = "C12_ORDER_ID")
    private Long orderId;

    @Column(name = "C12_ITEM_ID")
    private Long itemId;
}

@Entity
@Table(name = "T12_ORDER_DETAIL")
@Data
public class OrderDetail {
    @EmbeddedId
    private OrderDetailKey id = new OrderDetailKey();

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "C12_ORDER_ID")
    private Order order;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "C12_ITEM_ID")
    private Item item;

    @Column(name = "C12_AMOUNT")
    private Integer amount;
}