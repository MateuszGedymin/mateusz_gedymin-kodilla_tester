package com.kodilla.jacoco;

public class Year {
    int yearNumber;

    public Year(int year) {
        this.yearNumber = year;
    }

    public boolean isLeap() {
        if (this.yearNumber % 4 == 0) {
            if (this.yearNumber % 100 == 0) {
                return this.yearNumber % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}