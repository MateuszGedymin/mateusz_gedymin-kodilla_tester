package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;


import java.util.Random;



public class CarsApplication {

    private static final Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        int drawCar = random.nextInt(3);
        int randomNumberOfCars = random.nextInt(100) + 80;
        if (drawCar == 0)
            return new Ford(randomNumberOfCars);
        else if (drawCar == 1)
            return new Volkswagen(randomNumberOfCars);
        else
            return new Opel(randomNumberOfCars);
    }

}
