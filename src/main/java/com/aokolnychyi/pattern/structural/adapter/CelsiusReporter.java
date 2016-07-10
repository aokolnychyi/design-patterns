package com.aokolnychyi.pattern.structural.adapter;

public class CelsiusReporter {

  private double temperatureInCelsius;

  public double getTemperature() {
    return temperatureInCelsius;
  }

  public void setTemperature(double temperatureInCelsius) {
    this.temperatureInCelsius = temperatureInCelsius;
  }
}