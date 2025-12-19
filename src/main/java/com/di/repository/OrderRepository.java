package com.di.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.di.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
