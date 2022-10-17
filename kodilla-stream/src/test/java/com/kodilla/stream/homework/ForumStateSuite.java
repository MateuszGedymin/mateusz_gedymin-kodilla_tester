package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStateSuite {

    @Test
    public void shouldAddOneHuman() {
        List<User> users = new ArrayList<>();
        users.add(new User("Jacek", 40, 2000, "Human"));

        assertEquals(2000, ForumStats.averageAbove40(users));
    }
}
