package com.model;

import com.brand.Audi;
import com.Vehicle;

public class A6 extends Audi implements Vehicle {
    private String offRoad;

    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public A6(
            int numWheels,
            int numDoors,
            String color,
            String fuel,
            boolean autopilot,
            boolean quatro,
            String offRoad) {
        super(numWheels, numDoors, color, fuel, autopilot, quatro);
        this.offRoad = offRoad;
    }

    public String getOffRoad() {
        return offRoad;
    }

    public void setOffRoad(String offRoad) {

        this.offRoad = offRoad;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Off Road: " + offRoad);
    }

    @Override
    public void speed() {

    }

    @Override
    public String toString() {
        return "A6{" +
                "offRoad='" + offRoad + '\'' +
                ", model=" + model +
                '}';
    }
}
