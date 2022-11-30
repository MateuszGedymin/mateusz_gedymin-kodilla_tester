package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    @BeforeEach
    public void addingOrders() {
        Shop.AddOrderToSet(order1);
        Shop.AddOrderToSet(order2);
        Shop.AddOrderToSet(order3);
        Shop.AddOrderToSet(order4);
        Shop.AddOrderToSet(order5);
        Shop.AddOrderToSet(order6);
        Shop.AddOrderToSet(order7);
    }

    Set<Order> orderSet = new HashSet<>();
    Order order3 = new Order(8, LocalDate.of(2020,12,25), "manfredi");
    Order order1 = new Order(20, LocalDate.of(2022,4,10), "adam");
    Order order6 = new Order(31, LocalDate.of(2021,6,15), "houa");
    Order order7 = new Order(49, LocalDate.of(2021,8,19), "avice");
    Order order5 = new Order(75, LocalDate.of(2022,2,10), "lucky");
    Order order2 = new Order(82, LocalDate.of(2020,11,16), "jeremy");
    Order order4 = new Order(99, LocalDate.of(2021,9,7), "endre");

    @Test
    void shouldAddOrder() {
        Shop.ClearList();
        Shop.AddOrderToSet(order1);

        assertEquals(1, Shop.ReturnOrderListSize());
    }
    @Test
    void shouldReturnListsWithinTwoDates() {
        Set<Order> list = Shop.ReturnListsWithinTwoDates(order1, order3);

        assertEquals(orderSet, list);
    }
    @Test
    void shouldReturnListBasedOnRange() {
        Set<Order> list = Shop.ReturnListBasedOnRange(order3, order6);
        Set<Order> expextedList = new HashSet<>();
        expextedList.add(order1);

        assertEquals(expextedList, list);
    }
    @Test
    void shouldReturnOrderListSize() {
        Shop.ClearList();
        Shop.AddOrderToSet(order1);
        Shop.AddOrderToSet(order2);
        Shop.AddOrderToSet(order3);
        int sum = Shop.ReturnOrderListSize();

        assertEquals(3, sum);
    }
    @Test
    void shouldSumUpAllOrders() {
        int sum = Shop.SumUpAllOrders();

        assertEquals(364, sum);
    }

}