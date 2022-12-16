package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {400, 4, 1600})
    void shouldBeLeapYear(int number) {

        //given
        Year year = new Year(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {391, 10, 99, 100})
    void shouldNotLeapYear(int number) {

        //given
        Year year = new Year(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}