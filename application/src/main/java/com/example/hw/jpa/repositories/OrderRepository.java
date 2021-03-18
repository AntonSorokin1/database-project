package com.example.hw.jpa.repositories;

import com.example.hw.jpa.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByCustomerId(int customerId);
}
