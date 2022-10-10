package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> map = new HashMap<>();

        School silesianVoivodeship = new School("Silesian", new ArrayList<>(Arrays.asList(100)));
        School pomeranianVoivodeship = new School("Pomeranian", new ArrayList<>(Arrays.asList(50)));
        School warmianMasurianVoivodeship = new School("Warmia", new ArrayList<>(Arrays.asList(70)));

        Principal principal1 = new Principal("Marcin", "Kowalczyk");
        Principal principal2 = new Principal("Adam", "Walczak");
        Principal principal3 = new Principal("Marek", "Odniewicz");

        map.put(silesianVoivodeship, principal1);
        map.put(pomeranianVoivodeship, principal2);
        map.put(warmianMasurianVoivodeship, principal3);

        for (Map.Entry<School, Principal> schoolPrincipalEntry : map.entrySet()) {
            System.out.println(schoolPrincipalEntry.getKey() + " " + schoolPrincipalEntry.getValue());
        }
    }
}
