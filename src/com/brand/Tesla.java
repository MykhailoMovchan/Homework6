package com.brand;

import com.Avto;
import com.Vehicle;

public class Tesla extends Avto implements Vehicle {
  private String batteryType;
  public Tesla(
          int numWheels,
          int numDoors,
          String color,
          String fuel,
          boolean autopilot,
          String batteryType) {
      super(numWheels, numDoors, color, fuel, autopilot);
      this.batteryType = batteryType;
  }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Battery Type: " + batteryType);
    }

    @Override
    public void speed() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tesla{");
        sb.append("batteryType='").append(batteryType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
