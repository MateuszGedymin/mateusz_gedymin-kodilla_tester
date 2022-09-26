package com.kodilla.inheritance.homework;

public class Main {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(0);
        System.out.println("\r");
        operatingSystem.turnOn();
        System.out.println("I'm Operating system, i was made " + operatingSystem.getProductionYear());
        operatingSystem.turnOff();
        System.out.println("\r");

        OperatingSystem oldSystem = new OldSystem(1999);
        oldSystem.turnOn();
        System.out.println("I'm old system, i was made in " + oldSystem.getProductionYear());
        oldSystem.turnOff();
        System.out.println("\r");

        OperatingSystem newSystem = new NewSystem(2020);
        newSystem.turnOn();
        System.out.println("I'm new system, i was made in " + newSystem.getProductionYear());
        newSystem.turnOff();
    }
}
