package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalName, principalLastName;


    public Principal(String principalName, String principalLastName) {
        this.principalName = principalName;
        this.principalLastName = principalLastName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getPrincipalLastName() {
        return principalLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(getPrincipalName(), principal.getPrincipalName()) && Objects.equals(getPrincipalLastName(), principal.getPrincipalLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrincipalName(), getPrincipalLastName());
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                ", principalLastName='" + principalLastName + '\'' +
                '}';
    }
}
