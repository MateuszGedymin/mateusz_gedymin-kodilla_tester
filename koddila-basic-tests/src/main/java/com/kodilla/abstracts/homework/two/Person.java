package com.kodilla.abstracts.homework.two;

public class Person {
    private final String firstName;
    private final int age;

    private final Job job;

    public  Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Job getJob() {
        return job;
    }
}