package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    List<User> list = new ArrayList<>();

    @BeforeEach
    void setUp() {
        list.add(new User("Walter White", 50, 7, "Chemists"));
        list.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        list.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        list.add(new User("Gus Firing", 49, 0, "Board"));
        list.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        list.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
    }

    @Test
    void filterChemistFromList() {
        List<String> filtered = UsersManager.filterChemistGroupUsernames();
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        Assertions.assertEquals(expected,filtered);
    }

    @Test
    void returnListForPplOlederThan45() {
        List<String> filtered = UsersManager.pplOlderThanNumber(45);
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gus Firing");
        expected.add("Mike Ehrmantraut");
        Assertions.assertEquals(expected, filtered);
    }

    @Test
    void returnTrueForPplWhoPostedSomething() {
        List<String> filtered = UsersManager.pplEverPosted();
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Jessie Pinkman");
        expected.add("Tuco Salamanca");
        expected.add("Gale Boetticher");
        Assertions.assertEquals(expected, filtered);
    }
}