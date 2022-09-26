package com.kodilla.abstracts.homework.one;

public abstract class Shape {

    private int
    a,
    b;

    public  Shape(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public abstract void area();

    public abstract void diameter();
}
