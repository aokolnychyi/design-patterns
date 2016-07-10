package com.aokolnychyi.pattern.structural.bridge;

public abstract class Vehicle {

  protected FuelFiller fuelFiller;

  protected Vehicle(FuelFiller fuelFiller) {
    this.fuelFiller = fuelFiller;
  }

  public abstract void drive();

  public void fillFuel() {
    fuelFiller.fill();
  }
}
