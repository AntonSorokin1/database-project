package com.example.hw.jpa.controllers;

import com.example.hw.jpa.Customer;
import com.example.hw.jpa.Order;
import com.example.hw.jpa.services.CustomerService;
import com.example.hw.jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersAPIController extends CRUDController<Customer, CustomerService> {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}/orders")
    public List<Order> getOrders(@PathVariable(name = "id") int id) {
        return orderService.findAllByCustomerId(id);
    }
}
