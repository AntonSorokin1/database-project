package com.example.hw.jpa.services.impl;

import com.example.hw.jpa.Product;
import com.example.hw.jpa.repositories.ProductRepository;
import com.example.hw.jpa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public Product create(Product object) {
        repository.save(object);
        return object;
    }

    @Override
    public List<Product> readAll() {
        return repository.findAll();
    }

    @Override
    public Product read(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean update(Product object, int id) {
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
