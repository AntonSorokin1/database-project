package com.example.hw.jpa.controllers;

import com.example.hw.jpa.Customer;
import com.example.hw.jpa.services.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersAPIController extends CRUDController<Customer, CustomerService>{

}
