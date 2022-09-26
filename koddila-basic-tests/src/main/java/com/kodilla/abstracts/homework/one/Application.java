package com.kodilla.abstracts.homework.one;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square();
        System.out.println("Pole kwadratu wynosi ");
        square.area();
        System.out.println("Obwod kwadratu wynosi");
        square.diameter();
        System.out.println("\r");

        Shape triangle = new Triangle(10, 10);
        System.out.println("Pole trojkata wynosi ");
        triangle.area();
        System.out.println("Obwod trojkata wynosi");
        triangle.diameter();
        System.out.println("\r");

        Shape trapeze = new Trapeze(10, 10, 10);
        System.out.println("Pole trapezu wynosi ");
        trapeze.area();
        System.out.println("Obwod trapezu wynosi");
        trapeze.diameter();

    }
}
