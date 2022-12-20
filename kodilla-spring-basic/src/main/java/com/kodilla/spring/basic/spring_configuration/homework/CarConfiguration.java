package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarConfiguration {

    Random random = new Random();

    @Bean
    public Car seasonDepend(){
        Car car;
        int season = random.nextInt(4);
        if (season == 0){
            car = new Cabrio();
            car.hasHeadlightsTurnedOn();
            System.out.println("Should lights be on? " + car.hasHeadlightsTurnedOn());
            System.out.println("It's summer, time to ride " + car.getCarType());
        }
        else if (season == 1) {
            car = new SUV();
            System.out.println("Should lights be on? " + car.hasHeadlightsTurnedOn());
            System.out.println("It's winter, time to ride " + car.getCarType());

        }
        else {
            car = new Sedan();
            System.out.println("Should lights be on? " + car.hasHeadlightsTurnedOn());
            System.out.println("It's spring/autumn, time to ride " + car.getCarType());

        }
        return car;
    }
}
