package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int velocity;

    public Ford(int velocity) {
        this.velocity = velocity;
    }


    @Override
    public int getSpeed() {
        return velocity;
    }

    @Override
    public void increaseSpeed() {
        velocity += 5;
    }

    @Override
    public void decreaseSpeed() {
        velocity -= 2;
    }
}
