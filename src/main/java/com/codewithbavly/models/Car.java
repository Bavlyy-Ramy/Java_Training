package com.codewithbavly.models;

public class Car {

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = 0;
    }

    public void display() {
        System.out.println(brand + " " + model + " - " + year);
    }
}
