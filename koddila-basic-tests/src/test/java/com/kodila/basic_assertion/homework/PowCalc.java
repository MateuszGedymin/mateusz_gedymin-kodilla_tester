package com.kodila.basic_assertion.homework;


import com.kodilla.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowCalc {

    @Test
    public void testPow1() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = -2;
        double delta = 0.1;
        double powResult = calculator.pow(a, b);
        assertEquals(0.25, powResult, delta);
        }

    @Test
    public void testPow2() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;
        double delta = 0.1;
        double powResult = calculator.pow(a, b);
        assertEquals(1, powResult, delta);
    }

    @Test
    public void testPow3() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 2;
        double delta = 0.1;
        double powResult = calculator.pow(a, b);
        assertEquals(4, powResult, delta);
    }

    }
