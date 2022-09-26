package com.kodilla.basic_assertion;

public class Applicaton {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie");
        } else {
            System.out.println("Metoda sum nie działa poprawnie");
        }

        int subResult = calculator.sub(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subResult);
        if (correctSub) {
            System.out.println("Metoda sub działa poprawnie");
        } else {
            System.out.println("Metoda sub nie działa poprawnie");
        }

        double powResult = calculator.pow(a, b);
        boolean correctPow = ResultChecker.assertEqualsForDouble(390625, powResult);
        if (correctPow) {
            System.out.println("Metoda Pow działa poprawnie");
        } else {
            System.out.println("Metoda Pow nie działa poprawnie");
        }
    }
}
