package com.aokolnychyi.pattern.structural.adapter;

public class TemperatureAdapterObject implements TemperatureNotificator {

  private CelsiusReporter celsiusReporter;

  public TemperatureAdapterObject(CelsiusReporter celsiusReporter) {
    this.celsiusReporter = celsiusReporter;
  }

  @Override
  public double getTemperatureInFahrenheit() {
    final double temperatureInCelsius = celsiusReporter.getTemperature();
    return celsiusToFahrenheit(temperatureInCelsius);
  }

  @Override
  public void setTemperatureInFahrenheit(double temperatureInFahrenheit) {
    final double temperatureInCelsius = fahrenheitToCelsius(temperatureInFahrenheit);
    celsiusReporter.setTemperature(temperatureInCelsius);
  }

  @Override
  public double getTemperatureInCelsius() {
    return celsiusReporter.getTemperature();
  }

  @Override
  public void setTemperatureInCelsius(double temperatureInCelsius) {
    celsiusReporter.setTemperature(temperatureInCelsius);
  }

  private double fahrenheitToCelsius(double fahrenheit) {
    return ((fahrenheit - 32) * 5 / 9);
  }

  private double celsiusToFahrenheit(double celsius) {
    return ((celsius * 9 / 5) + 32);
  }
}
