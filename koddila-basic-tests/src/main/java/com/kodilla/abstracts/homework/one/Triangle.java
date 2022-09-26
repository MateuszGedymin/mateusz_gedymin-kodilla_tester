package com.kodilla.abstracts.homework.one;

public class Triangle extends Shape{

    double c;
    double h;

    public Triangle(double c, double h) {
        super(10, 10);
        this.c = c;
        this.h = h;
    }

    @Override
    public void area() {
        System.out.println((getA() * h) / 2);
    }

    @Override
    public void diameter() {
        System.out.println(getA() + getB() + c);
    }
}
