package com.kodilla.abstracts.homework.two;

public class Application {

    public static void main(String[] args) {
        Job baker = new Baker();
        Person person1 = new Person("John", 45, baker);
        System.out.println("Person1 is a " + person1.getJob().getJobName() + " have to do: " + person1.getJob().getResponsibilities());
        System.out.println("Person1 earn " + person1.getJob().getSalary());
        System.out.println("\r");

        Job tiler = new Tiler();
        Person person2 = new Person("Joanna", 50, tiler);
        System.out.println("Person2 is a "+ person2.getJob().getJobName() + " have to do: " + person2.getJob().getResponsibilities());
        System.out.println("Person2 earn " + person2.getJob().getSalary());
        System.out.println("\r");

        Job policeman = new Policeman();
        Person person3 = new Person("Gorge", 25, policeman);
        System.out.println("Person3 is a "+ person3.getJob().getJobName() + " have to do: " + person3.getJob().getResponsibilities());
        System.out.println("Person3 earn " + person3.getJob().getSalary());
        System.out.println("\r");

        Job fireman = new Fireman();
        Person person4 = new Person("Conan", 30, fireman);
        System.out.println("Person4 is a "+ person4.getJob().getJobName() + " have to do: " + person4.getJob().getResponsibilities());
        System.out.println("Person4 earn " + person4.getJob().getSalary());

    }
}
