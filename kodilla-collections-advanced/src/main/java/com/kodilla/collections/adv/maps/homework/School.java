package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

public class School {

    private ArrayList<Integer> studCount;
    private String schoolName;

    public School(String schoolName, ArrayList<Integer> studCount) {
        this.schoolName = schoolName;
        this.studCount = studCount;
    }

    @Override
    public String toString() {
        return "School{" +
                "studCount=" + studCount +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}