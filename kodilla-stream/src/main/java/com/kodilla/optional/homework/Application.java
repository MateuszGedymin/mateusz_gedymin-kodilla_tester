package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jacek", new Teacher("Adam Kowalski")));
        studentList.add(new Student("Marek", null));
        studentList.add(new Student("Kasia", new Teacher("Katarzyna Lewa")));
        studentList.add(new Student("Patrycja", null));
        studentList.add(new Student("Maciek", new Teacher("Adam Kowalski")));
        studentList.add(new Student("Jan", null));
        studentList.add(new Student("John", new Teacher("Katarzyna Lewa")));
        studentList.add(new Student("Ola", new Teacher("Adam Kowalski")));
        studentList.add(new Student("Jon", null));



        for (Student students: studentList) {
            System.out.println("Student " + students.getName() + ", " + "Teacher " + Optional.ofNullable(students.getTeacher()).orElse(new Teacher("<undefined>")));
        }


    }
}
