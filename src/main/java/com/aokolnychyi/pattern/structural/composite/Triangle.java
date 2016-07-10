package com.aokolnychyi.pattern.structural.composite;

// leaf
public class Triangle implements Shape {

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Triangle with color " + fillColor);
  }

}
