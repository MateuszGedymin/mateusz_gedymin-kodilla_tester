package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private static final Set<Order> orderSet = new HashSet<>();

    //dodanie nowego zamówienia,
    public static void AddOrderToSet(Order order) {
        orderSet.add(order);
    }

    public static void ClearList() {
        orderSet.clear();
    }

    //zwrócenie listy zamówień z zakresu dwóch dat,
    public static Set<Order> ReturnListsWithinTwoDates(Order order1, Order order2) {
    return orderSet.stream()
            .filter(order -> order.getDate().isAfter(order1.getDate()))
            .filter(order -> order.getDate().isBefore(order2.getDate()))
            .collect(Collectors.toSet());
    }


    //pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
    public static Set<Order> ReturnListBasedOnRange(Order minOrder, Order maxOrder) {
        return orderSet.stream()
                .filter(order -> order.getValue() > minOrder.getValue())
                .filter(order -> order.getValue() < maxOrder.getValue())
                .collect(Collectors.toSet());
    }


    //zwrócenie liczby zamówień,
    public static int ReturnOrderListSize() {
        return orderSet.size();
    }

    //zsumowanie wartości wszystkich zamówień.
    public static int SumUpAllOrders() {
        return orderSet.stream()
                .mapToInt(Order::getValue)
                .sum();
}}
