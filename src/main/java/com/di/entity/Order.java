package com.di.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")   // avoid MySQL reserved word
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private double price;
    private int quantity;
    
    private String orderStatus;   // 👈 MUST be exactly this name
    private double totalAmount;

public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
}
}