package com.aokolnychyi.pattern.structural.bridge;

public class Car extends Vehicle {

  protected Car(FuelFiller fuelFiller) {
    super(fuelFiller);
  }

  @Override
  public void drive() {
  }
}
