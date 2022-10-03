package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Airplane", 5, 10, true));
        stamps.add(new Stamp("Car", 2, 2, false));
        stamps.add(new Stamp("Cat", 3, 7, true));
        stamps.add(new Stamp("Dog", 5, 1, true));
        stamps.add(new Stamp("Pot", 3, 3, false));
        stamps.add(new Stamp("Stamp", 9, 10, true));
        stamps.add(new Stamp("Cat", 3, 7, true));
        stamps.add(new Stamp("Elephant", 7, 5, true));
        stamps.add(new Stamp("Airplane", 5, 10, true));
        stamps.add(new Stamp("Cat", 3, 7, true));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps) {
            System.out.println(stamp);
        }
    }
}
