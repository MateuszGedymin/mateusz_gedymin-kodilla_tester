package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {


    @Test
    void shouldThrowError() {

        Warehouse.addOrder(new Order("21"));

        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("20"));
    }
}