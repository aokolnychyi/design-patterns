package com.aokolnychyi.pattern.structural.bridge;

public class Bus extends Vehicle {

  public Bus(FuelFiller fuelFiller) {
    super(fuelFiller);
  }

  @Override
  public void drive() {

  }
}
