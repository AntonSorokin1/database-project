package com.example.hw.jpa.services.impl;

import com.example.hw.jpa.Order;
import com.example.hw.jpa.repositories.OrderRepository;
import com.example.hw.jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    @Override
    public Order create(Order object) {
        repository.save(object);
        return object;
    }

    @Override
    public List<Order> readAll() {
        return repository.findAll();
    }

    @Override
    public Order read(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean update(Order object, int id) {
        if (repository.existsById(id)) {
            object.setId(id);
            repository.save(object);
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
