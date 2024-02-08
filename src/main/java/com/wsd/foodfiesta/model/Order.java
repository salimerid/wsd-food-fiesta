package com.wsd.foodfiesta.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNo;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "sale_date")
    private LocalDate saleDate;

    @Column(name = "sale_amount")
    private BigDecimal saleAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
