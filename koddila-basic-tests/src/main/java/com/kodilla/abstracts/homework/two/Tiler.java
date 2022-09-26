package com.kodilla.abstracts.homework.two;

public class Tiler extends Job {


    public Tiler() {
        super("Tiler", 8000, "1.Tile roof 2.Make good roof 3.Make it good");
    }

    @Override
    public void salary() {
        System.out.println("Tiler salary: " + getSalary());
    }

    @Override
    public void responsibilities() {
        System.out.println("Tiler responsibilities: " + getResponsibilities());
    }
}

