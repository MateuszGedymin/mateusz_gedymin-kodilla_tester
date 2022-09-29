package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {
    private int velocity;

    public Volkswagen(int velocity) {
        this.velocity = velocity;
    }


    @Override
    public int getSpeed() {
        return velocity;
    }

    @Override
    public void increaseSpeed() {
        velocity += 3;
    }

    @Override
    public void decreaseSpeed() {
        velocity -= 1;
    }
}
