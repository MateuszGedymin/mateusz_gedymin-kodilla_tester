package com.kodila.basic_assertion.homework;


import com.kodilla.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubCalc {

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }
}
