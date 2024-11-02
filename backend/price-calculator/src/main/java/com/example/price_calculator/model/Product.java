package com.example.pricecalculator.model;

public class Product {
    private String name;
    private int unitsPerCarton;
    private double cartonPrice;
    private double singleUnitPrice;

    public Product(String name, int unitsPerCarton, double cartonPrice) {
        this.name = name;
        this.unitsPerCarton = unitsPerCarton;
        this.cartonPrice = cartonPrice;
        this.singleUnitPrice = (cartonPrice * 1.3) / unitsPerCarton; // 30% increase for single units
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitsPerCarton() {
        return unitsPerCarton;
    }

    public void setUnitsPerCarton(int unitsPerCarton) {
        this.unitsPerCarton = unitsPerCarton;
    }

    public double getCartonPrice() {
        return cartonPrice;
    }

    public void setCartonPrice(double cartonPrice) {
        this.cartonPrice = cartonPrice;
    }

    public double getSingleUnitPrice() {
        return singleUnitPrice;
    }

    public void setSingleUnitPrice(double singleUnitPrice) {
        this.singleUnitPrice = singleUnitPrice;
    }
}
