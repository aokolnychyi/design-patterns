package com.aokolnychyi.pattern.structural.adapter;

public interface TemperatureNotificator {

  double getTemperatureInFahrenheit();

  void setTemperatureInFahrenheit(double temperatureInFahrenheit);

  double getTemperatureInCelsius();

  void setTemperatureInCelsius(double temperatureInCelsius);
}
