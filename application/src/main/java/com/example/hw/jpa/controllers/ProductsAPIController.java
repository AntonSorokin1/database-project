package com.example.hw.jpa.controllers;

import com.example.hw.jpa.Product;
import com.example.hw.jpa.services.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsAPIController extends CRUDController<Product, ProductService> {

}
