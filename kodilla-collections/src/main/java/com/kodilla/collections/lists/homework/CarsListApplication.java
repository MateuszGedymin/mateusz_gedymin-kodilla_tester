package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.getCarsName;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> car = new ArrayList<>();
        car.add(new Ford(250));
        Car car1 = new Opel(150);
        car.add(new Volkswagen(350));
        car.add(new Ford(100));
        car.add(new Opel(200));
        car.add(new Volkswagen(220));

        car.remove(0);

        car.remove(car1);


        System.out.println(car.size());
        for (Car cars : car) {
            System.out.println("-----------------------------");
            System.out.println("Car name: " + getCarsName(cars));
            System.out.println("Car's speed: " + cars.getSpeed());
        }
    }
}
