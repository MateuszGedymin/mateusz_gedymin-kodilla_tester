package com.kodilla.inheritance.homework;

public class NewSystem extends OperatingSystem {

    public NewSystem(int productionYear) {
        super(productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("I don't know what to do, i'm new system");
    }

    @Override
    public void turnOff() {
        System.out.println("I can't turn off, new systems for the win.");
    }
}
