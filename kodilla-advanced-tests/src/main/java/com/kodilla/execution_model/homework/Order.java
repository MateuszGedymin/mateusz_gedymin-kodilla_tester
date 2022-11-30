package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Order {
    private int value;
    private LocalDate date;
    private String login;

    public Order(int value, LocalDate date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public int getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return getValue() == order.getValue() && Objects.equals(getDate(), order.getDate()) && Objects.equals(getLogin(), order.getLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getDate(), getLogin());
    }
}
