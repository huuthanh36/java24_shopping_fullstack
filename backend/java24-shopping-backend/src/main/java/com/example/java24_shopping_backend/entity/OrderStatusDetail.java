package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

@Embeddable
@Data
class OrderStatusDetailKey implements Serializable {
    @Column(name = "C14_ORDER_ID")
    private Long orderId;

    @Column(name = "C14_ORDER_STATUS_ID")
    private Long statusId;
}

@Entity
@Table(name = "T14_ORDER_STATUS_DETAIL")
@Data
public class OrderStatusDetail {
    @EmbeddedId
    private OrderStatusDetailKey id = new OrderStatusDetailKey();

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "C14_ORDER_ID")
    private Order order;

    @ManyToOne
    @MapsId("statusId")
    @JoinColumn(name = "C14_ORDER_STATUS_ID")
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "C14_EMPLOYEE_ID")
    private Employee employee;

    @Column(name = "C14_LAST_UPDATED")
    private LocalDateTime lastUpdated;
}