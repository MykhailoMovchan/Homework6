package com.brand;

import com.Avto;
import com.Vehicle;

public class BMW extends Avto implements Vehicle {
    private boolean sportPackage;

    public BMW(
            int numWheels,
            int numDoors,
            String color,
            String fuel,
            boolean autopilot,
            boolean sportPackage) {
        super(numWheels, numDoors, color, fuel, autopilot);
        this.sportPackage = sportPackage;
    }

    public boolean isSportPackage() {

        return sportPackage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Sport Package : " + sportPackage);
    }

    @Override
    public void speed() {

    }

    @Override
    public String toString() {
        return "BMW{" +
                "sportPackage=" + sportPackage +
                "} " + super.toString();
    }
}