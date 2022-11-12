package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("10"));
        Warehouse.addOrder(new Order("20"));
        Warehouse.addOrder(new Order("36"));
        Warehouse.addOrder(new Order("60"));
        Warehouse.addOrder(new Order("45"));

        Warehouse.getOrder("10");
        Warehouse.getOrder("20");
        Warehouse.getOrder("25");

    }
}
