package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework2.ProvidePplToTests#ProvidePplToTests")
    public void shouldReturnBMIForPplList(double weight, double height, String expected){
        Person person = new Person(weight, height);
        assertEquals(expected, person.getBMI());
    }



}
