package com.aokolnychyi.pattern.structural.adapter;

// Adapter class
public class TemperatureAdapterClass extends CelsiusReporter implements TemperatureNotificator {

  @Override
  public double getTemperatureInFahrenheit() {
    final double temperatureInCelsius = getTemperature();
    return celsiusToFahrenheit(temperatureInCelsius);
  }

  @Override
  public void setTemperatureInFahrenheit(double temperatureInFahrenheit) {
    final double temperatureInCelsius = fahrenheitToCelsius(temperatureInFahrenheit);
    setTemperature(temperatureInCelsius);
  }

  @Override
  public double getTemperatureInCelsius() {
    return getTemperature();
  }

  @Override
  public void setTemperatureInCelsius(double temperatureInCelsius) {
    setTemperature(temperatureInCelsius);
  }

  private double fahrenheitToCelsius(double fahrenheit) {
    return ((fahrenheit - 32) * 5 / 9);
  }

  private double celsiusToFahrenheit(double celsius) {
    return ((celsius * 9 / 5) + 32);
  }
}
