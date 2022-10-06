package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;


import java.util.Random;



public class CarsApplication {


    private static Car drawCar() {
        Random random = new Random();
        int car = random.nextInt(3);
        int getSpeed = getSpeed(random);
        if (car == 0)
            return new Ford(getSpeed);
        else if (car == 1)
            return new Opel(getSpeed);
        else
            return new Volkswagen(getSpeed);
    }

    private static int getRandomAmountOfCars() {
        Random random = new Random();
        int minCars = 1;
        int maxCars = 15;
        return random.nextInt((maxCars + 1 - minCars) + minCars);
    }


    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int i = 0; i < getRandomAmountOfCars(); i++) {
            cars[i] = drawCar();
            for (Car car: cars)
                CarUtils.describeCar(car);
        }

    }



    private static int getSpeed(Random random){
        int maxSpeed = 350;
        return random.nextInt(maxSpeed + 1);
    }



}
