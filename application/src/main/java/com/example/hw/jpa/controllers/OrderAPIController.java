package com.example.hw.jpa.controllers;

import com.example.hw.jpa.Order;
import com.example.hw.jpa.services.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderAPIController extends CRUDController<Order, OrderService> {

}
