package com.kodilla.abstracts.homework.two;

public class Fireman extends Job {


    public Fireman() {
        super("Fireman", 3500, "1.Stop fires 2.Save cats 3.Make it good");
    }

    @Override
    public void salary() {
        System.out.println("Fireman salary: " + getSalary());
    }

    @Override
    public void responsibilities() {
        System.out.println("Fireman responsibilities: " + getResponsibilities());
    }
}

