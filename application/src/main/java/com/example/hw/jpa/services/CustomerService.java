package com.example.hw.jpa.services;

import com.example.hw.jpa.entity.Customer;

import java.util.List;

public interface CustomerService {
    void create(Customer customer);

    List<Customer> readAll();

    Customer read(int id);

    boolean update(Customer client, int id);

    boolean delete(int id);
}
