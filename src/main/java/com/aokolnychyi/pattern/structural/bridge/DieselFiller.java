package com.aokolnychyi.pattern.structural.bridge;

public class DieselFiller implements FuelFiller {

  @Override
  public void fill() {
    System.out.println("Filling with diesel!");
  }
}
