package com.model;

public class A6Builder {
    private int numWheels = 4;
    private int numDoors = 4;
    private String color;
    private String fuel;
    private boolean autopilot;
    private boolean quatro;
    private String offRoad;

    public A6Builder setNumWheels(int numWheels) {
        this.numWheels = numWheels;
        return this;
    }

    public A6Builder setNumDoors(int numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    public A6Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public A6Builder setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    public A6Builder setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
        return this;
    }

    public A6Builder setQuatro(boolean quatro) {
        this.quatro = quatro;
        return this;
    }

    public A6Builder setOffRoad(String offRoad) {
        this.offRoad = offRoad;
        return this;
    }

    public A6 createA6() {
        return new A6(numWheels, numDoors, color, fuel, autopilot, quatro, offRoad);
    }
}