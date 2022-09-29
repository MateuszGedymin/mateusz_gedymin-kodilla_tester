package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(0);
        doRace(ford);
        Car opel = new Opel(0);
        doRace(opel);
        Car volkswagen = new Volkswagen(0);
        doRace(volkswagen);


    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println( "Car's velocity: " + car.getSpeed());
    }
}
