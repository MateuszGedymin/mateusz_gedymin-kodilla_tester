package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ProvidePplToTests {
    public static Stream<Arguments> ProvidePplToTests() {
        return Stream.of(
                Arguments.of(1.74, 70.0, "Normal (healthy weight)"),
                Arguments.of(1.5, 130.5, "Obese Class V (Super Obese)"),
                Arguments.of(1.60, 40.6, "Severely underweight"),
                Arguments.of(1.74, 100.2, "Obese Class I (Moderately obese)"),
                Arguments.of(1.82, 90.2, "Overweight")
        );
    }
}
