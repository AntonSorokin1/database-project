package com.example.hw.jpa.services.impl;

import com.example.hw.jpa.Customer;
import com.example.hw.jpa.repositories.CustomerRepository;
import com.example.hw.jpa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer create(Customer customer) {
        repository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> readAll() {
        return repository.findAll();
    }

    @Override
    public Customer read(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean update(Customer customer, int id) {
        if (repository.existsById(id)) {
            customer.setId(id);
            repository.save(customer);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
