package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double averageAbove40Group = averageAbove40(UsersRepository.getUsersList());
        System.out.println(averageAbove40Group);
        double averageBelow4040Group = averageBelow40(UsersRepository.getUsersList());
        System.out.println(averageBelow4040Group);
    }

    public static double averageAbove40(List<User> getUsersList) {

        return getUsersList.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(value -> value.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static double averageBelow40(List<User> getUsersList) {


        return getUsersList.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(value -> value.getNumberOfPost())
                .average()
                .getAsDouble();
    }

}
