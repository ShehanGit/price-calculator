package com.example.price_calculator.controller;

import com.example.price_calculator.service.PriceService;
import com.example.price_calculator.service.ProductService;
import com.example.pricecalculator.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final PriceService priceService;

    public ProductController(ProductService productService, PriceService priceService) {
        this.productService = productService;
        this.priceService = priceService;
    }

    @GetMapping
    public ResponseEntity<Map<String, Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculatePrice(@RequestParam String productName, @RequestParam int quantity) {
        Product product = productService.getProductByName(productName);
        if (product == null) {
            return ResponseEntity.badRequest().body(null); // Return a 400 error if product not found
        }

        double price = priceService.calculatePrice(product, quantity);
        return ResponseEntity.ok(price);
    }
}
