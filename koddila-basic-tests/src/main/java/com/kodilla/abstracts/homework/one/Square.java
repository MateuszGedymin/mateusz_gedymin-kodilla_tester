package com.kodilla.abstracts.homework.one;

public class Square extends Shape {

    public Square() {
        super(10, 10);
    }

    @Override
    public void area() {
        double result = Math.pow(getA(), 2);
        System.out.println(result);
    }

    @Override
    public void diameter() {
        double result = (4 * getA());
        System.out.println(result);
    }
}
