package com.example.hw.jpa.services;

import com.example.hw.jpa.Order;

import java.util.List;

public interface OrderService extends CRUDService<Order> {
    List<Order> findAllByCustomerId(int customerId);
}
