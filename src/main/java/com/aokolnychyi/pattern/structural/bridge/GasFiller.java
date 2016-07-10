package com.aokolnychyi.pattern.structural.bridge;

public class GasFiller implements FuelFiller {

  @Override
  public void fill() {
    System.out.println("Filling with gas!");
  }
}