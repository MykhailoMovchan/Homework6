package com.model;

import com.brand.BMW;
import com.Vehicle;

import java.util.StringJoiner;

public class X5 extends BMW implements Vehicle {
    private String comfort;

    public X5(
            int numWheels,
            int numDoors,
            String color,
            String fuel,
            boolean autopilot,
            boolean sportPackage,
            String comfort) {
        super(numWheels, numDoors, color, fuel, autopilot, sportPackage);
        this.comfort = comfort;
    }

    public String getComfort() {

        return comfort;
    }

    public void setComfort(String comfort) {

        this.comfort = comfort;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Comfort : " + comfort);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", X5.class.getSimpleName() + "[", "]")
                .add("comfort='" + comfort + "'")
                .toString();
    }
}