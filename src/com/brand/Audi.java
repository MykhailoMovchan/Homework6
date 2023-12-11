package com.brand;

import com.Avto;

public class Audi extends Avto {
    private boolean quatro;

    public Audi(int numWheels, int numDoors, String color, String fuel, boolean autopilot, boolean quatro) {
        super(numWheels, numDoors, color, fuel, autopilot);
        this.quatro = quatro;
    }

    public boolean isQuatro() {

        return quatro;
    }

    public void setQuatro(boolean quatro) {

        this.quatro = quatro;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Quatro: " + quatro);
    }

    @Override
    public void speed() {

    }
}