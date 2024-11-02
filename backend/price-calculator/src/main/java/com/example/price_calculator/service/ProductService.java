package com.example.price_calculator.service;

import com.example.pricecalculator.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private final Map<String, Product> products = new HashMap<>();

    public ProductService() {
        // Initialize with hard-coded products
        products.put("Penguin-ears", new Product("Penguin-ears", 20, 175.0));
        products.put("Horseshoe", new Product("Horseshoe", 5, 825.0));
    }

    public Product getProductByName(String name) {
        return products.get(name);
    }

    public Map<String, Product> getAllProducts() {
        return products;
    }
}
