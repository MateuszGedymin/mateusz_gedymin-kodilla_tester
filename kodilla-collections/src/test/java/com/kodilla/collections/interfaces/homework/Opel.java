package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int velocity;

    public Opel(int velocity) {
        this.velocity = velocity;
    }


    @Override
    public int getSpeed() {
        return velocity;
    }

    @Override
    public void increaseSpeed() {
        velocity += 4;
    }

    @Override
    public void decreaseSpeed() {
        velocity -= 3;
    }
}