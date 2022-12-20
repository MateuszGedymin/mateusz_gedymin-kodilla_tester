package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    LocalTime hour = LocalTime.now();
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hour.isAfter(LocalTime.of(20, 0, 0)) || hour.isBefore(LocalTime.of(6, 0, 1));

    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
