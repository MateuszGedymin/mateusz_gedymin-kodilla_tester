package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flightRepositories = new ArrayList<>();

    public static void main(String[] args) {
        flightRepositories.add(new Flight("Warsaw", "Moskow"));
        flightRepositories.add(new Flight("Paris", "Rome"));
        flightRepositories.add(new Flight("Warsaw", "Paris"));
        flightRepositories.add(new Flight("Paris", "Moskow"));

        System.out.println(FlightFinder.findFlightsFrom("Warsaw"));
    }


    public static List<Flight> getFlightsTable() {
        return flightRepositories;
    }
}
