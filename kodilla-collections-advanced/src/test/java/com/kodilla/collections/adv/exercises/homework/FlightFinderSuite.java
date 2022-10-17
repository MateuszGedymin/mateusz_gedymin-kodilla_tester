package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderSuite {
    @Test
    public void shouldFindFlightToParis() {
        List<Flight> result = FlightFinder.findFlightsTo("Paris");

        assertEquals(FlightRepository.getFlightsTable(), result);
    }

    @Test
    public void shouldFindFlightFromWarsaw() {
        List<Flight> result = FlightFinder.findFlightsFrom("Warsaw");

        assertEquals(FlightRepository.getFlightsTable(), result);
    }
}
