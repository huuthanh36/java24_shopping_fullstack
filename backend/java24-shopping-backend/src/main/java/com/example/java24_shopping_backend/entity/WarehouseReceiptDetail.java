package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
class WarehouseReceiptDetailKey implements Serializable {
    @Column(name = "C05_WHRECEIPT_ID")
    private Long receiptId;

    @Column(name = "C05_ITEM_ID")
    private Long itemId;
}

@Entity
@Table(name = "T05_WAREHOUSE_RECEIPT_DETAIL")
@Data
public class WarehouseReceiptDetail {
    @EmbeddedId
    private WarehouseReceiptDetailKey id = new WarehouseReceiptDetailKey();

    @ManyToOne
    @MapsId("receiptId")
    @JoinColumn(name = "C05_WHRECEIPT_ID")
    private WarehouseReceipt receipt;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "C05_ITEM_ID")
    private Item item;

    @Column(name = "C05_AMOUNT")
    private Integer amount;

    @Column(name = "C05_BUY_PRICE")
    private Double buyPrice;

    @ManyToOne
    @JoinColumn(name = "C05_PROVIDER_ID")
    private Provider provider;
}