package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/NumbersforWinsCount.csv", numLinesToSkip = 1)
    public void shouldCheckIfWeProvideCorrectNumbers(int expected, int firstNumber, int secnmber, int thirdNumber) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(firstNumber);
        userNumbers.add(secnmber);
        userNumbers.add(thirdNumber);
        assertEquals(expected, gamblingMachine.howManyWins(userNumbers));
    }
}
