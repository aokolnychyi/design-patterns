package com.aokolnychyi.pattern.structural.composite;

// leaf
public class Circle implements Shape {

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Circle with color " + fillColor);
  }

}