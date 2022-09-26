package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem {


    public OldSystem(int productionYear) {
        super(productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("I will not turn on system! I'm too old for this.");
    }

    @Override
    public void turnOff() {
        System.out.println("System is off forever.");
    }

}
