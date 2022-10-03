package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String  stampName;
    private double width;
    private double height;
    private boolean stamped;

    public Stamp(String stampName, double width, double height, boolean stamped) {
        this.stampName = stampName;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getStampName() {
        return stampName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.getWidth(), getWidth()) == 0 && Double.compare(stamp.getHeight(), getHeight()) == 0 && stamped == stamp.stamped && Objects.equals(getStampName(), stamp.getStampName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getWidth(), getHeight(), stamped);
    }

    @Override
    public String toString() {
        return "Stamp " + "{" + "Stamp Name = " + stampName + ", " +
                "dimensions = " + height + "/" + width + ", " + "Stamped = " + stamped + "}";
    }
}
