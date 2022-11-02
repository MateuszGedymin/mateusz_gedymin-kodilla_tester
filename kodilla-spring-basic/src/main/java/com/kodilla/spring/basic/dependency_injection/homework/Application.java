package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        ShippingCenter shippingCenter = new ShippingCenter(new DeliveryService(), new NotificationService() {
            @Override
            public void success(String address) {
                System.out.println("Package delivered to: " + address);
            }

            @Override
            public void fail(String address) {
                System.out.println("Package not delivered to: " + address);
            }
        });
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}