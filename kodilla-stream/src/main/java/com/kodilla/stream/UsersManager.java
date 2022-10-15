package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }



    public static List<String> pplOlderThanNumber(int number) {
        List<String> usersList = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > number )
                .map(User::getUsername)
                .collect(Collectors.toList());
        return usersList;
    }

    public static List<String> pplEverPosted() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 0 )
                .map(User::getUsername)
                .collect(Collectors.toList());
    }

}