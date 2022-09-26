package com.kodilla.abstracts.homework.two;

public class Baker extends Job {


    public Baker() {
        super("Baker", 4000, "1.Cook 2.Bake 3.Make dough");
    }

    @Override
    public void salary() {
        System.out.println("Baker salary: " + getSalary());
    }

    @Override
    public void responsibilities() {
        System.out.println("Baker responsibilities: " + getResponsibilities());
    }
}

