package com.example.hw.jpa.controllers;

import com.example.hw.jpa.entity.Customer;
import com.example.hw.jpa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersAPIController {
    @Autowired
    private CustomerService service;

    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer) {
        service.create(customer);
        return customer;
    }

    @GetMapping("/")
    public List<Customer> readAllCustomers() {
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Customer readCustomer(@PathVariable("id") int id) {
        return service.read(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable(name = "id") int id, @RequestBody Customer customer) {
        service.update(customer, id);
        return customer;
    }

    @DeleteMapping("/{id}")
    public boolean deleteCustomer(@PathVariable(name = "id") int id) {
        return service.delete(id);
    }
}
