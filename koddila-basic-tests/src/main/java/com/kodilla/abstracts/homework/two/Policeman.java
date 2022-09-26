package com.kodilla.abstracts.homework.two;

public class Policeman extends Job {


    public Policeman() {
        super("Policeman", 4000, "1.Keep peace 2.Arrest people 3.Make it good");
    }

    @Override
    public void salary() {
        System.out.println("Policeman salary: " + getSalary());
    }

    @Override
    public void responsibilities() {
        System.out.println("Policeman responsibilities: " + getResponsibilities());
    }
}

