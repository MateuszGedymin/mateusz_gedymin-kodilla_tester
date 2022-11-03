package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class DisplayTestSuite {

    @Test
    void shouldAddNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.add(10.0, 10.0);
        Assertions.assertEquals(result, "Calculation = 20.0");
    }
    @Test
    void shouldSubtractNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.subtract(10.0, 10.0);
        Assertions.assertEquals(result, "Calculation = 0.0");
    }
    @Test
    void shouldMultiplyNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.multiply(10.0, 10.0);
        Assertions.assertEquals(result, "Calculation = 100.0");
    }
    @Test
    void shouldDivideNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.divide(10.0, 10.0);
        Assertions.assertEquals(result, "Calculation = 1.0");
    }
}
