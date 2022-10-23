package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"test", "as0"})
    public void shouldReturnTrueIfUsernameIsValid(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test//", "use123Rt.;"})
    public void shouldReturnFalseIfUsernameIsInvalid(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test@test.test"})
    public void shouldReturnTrueIfEmailIsValid(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test", "11@11", "=-=-@;;.sda", "123@123.123"})
    public void shouldReturnFalseIfEmailIsInvalid(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

}
