package com;

public abstract class Avto implements Vehicle {
    protected int numWheels;
    protected int numDoors;
    protected String color;
    protected String fuel;
    protected boolean autopilot;

    public int getNumWheels() {

        return numWheels;
    }

    public void setNumWheels(int numWheels) {

        this.numWheels = numWheels;
    }

    public int getNumDoors() {

        return numDoors;
    }

    public void setNumDoors(int numDoors) {

        this.numDoors = numDoors;
    }

    public Avto(int numWheels, int numDoors, String color, String fuel, boolean autopilot) {
        this.numWheels = numWheels;
        this.numDoors = numDoors;
        this.color = color;
        this.fuel = fuel;
        this.autopilot = autopilot;
    }


    public void display() {
        System.out.println(" Number of Wheels: " + numWheels);
        System.out.println(" Number of Doors: " + numDoors);
        System.out.println(" Color: " + color);
        System.out.println(" Fuel Type: " + fuel);
        System.out.println(" Autopilot: " + autopilot);

    }
}

