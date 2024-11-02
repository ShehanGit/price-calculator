package com.example.price_calculator.service;

import com.example.pricecalculator.model.Product;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public double calculatePrice(Product product, int quantity) {
        int cartons = quantity / product.getUnitsPerCarton();
        int singleUnits = quantity % product.getUnitsPerCarton();

        double cartonPrice = cartons * product.getCartonPrice();
        double singleUnitPrice = singleUnits * product.getSingleUnitPrice();

        if (cartons >= 3) {
            cartonPrice *= 0.9; // Apply 10% discount
        }

        return cartonPrice + singleUnitPrice;
    }
}
