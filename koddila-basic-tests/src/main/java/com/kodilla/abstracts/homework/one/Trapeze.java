package com.kodilla.abstracts.homework.one;

public class Trapeze extends Shape{

    double h;
    double c;
    double d;

    public Trapeze(double h, double c, double d) {
        super(10, 10);
        this.h = h;
        this.c = c;
        this.d = d;
    }

    @Override
    public void area() {
        System.out.println(((getA() + getB()) * h) / 2);
    }

    @Override
    public void diameter() {
        System.out.println(getA() + getB() + c + d);
    }
}
