package com.kodilla.spring.basic.spring_dependency_injection.homework.homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ShippingCenterTestSuite {


    @Test
    void shouldDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework.homework2"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("ul.Szkolna", 20);
        Assertions.assertEquals("Package delivered to: ul.Szkolna", message);
    }

    @Test
    void shouldFailToDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework.homework2"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("ul.Koszerna", 35);
        Assertions.assertEquals("Package not delivered to: ul.Koszerna", message);
    }
}