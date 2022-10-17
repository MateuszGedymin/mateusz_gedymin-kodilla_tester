package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {


    @Test
    public void shouldAddStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jacek", new Teacher("Adam Kowalski")));

        assertEquals(1, studentList.size());

    }
}
