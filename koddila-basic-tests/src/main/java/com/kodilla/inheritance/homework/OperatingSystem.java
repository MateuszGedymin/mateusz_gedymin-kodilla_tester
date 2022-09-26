package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int productionYear;

    public OperatingSystem(int productionYear) {
        this.productionYear = productionYear;
    }

    public void turnOn() {
        System.out.println("Operating system is turned on!");
    }

    public void turnOff() {
        System.out.println("Operating system is turned off!");
    }

    public int getProductionYear() {
        return productionYear;
    }
}
