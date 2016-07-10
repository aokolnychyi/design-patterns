package com.aokolnychyi.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

  public enum ShapeType {
    OVAL_FILL, OVAL_NO_FILL, LINE
  }

  private static final Map<ShapeType, Shape> shapes = new HashMap<>();

  public static Shape getShape(final ShapeType type) {
    Shape shapeImpl = shapes.get(type);

    // consider all intrinsic properties
    if (shapeImpl == null) {
      if (type.equals(ShapeType.OVAL_FILL)) {
        shapeImpl = new Oval(true);
      } else if (type.equals(ShapeType.OVAL_NO_FILL)) {
        shapeImpl = new Oval(false);
      } else if (type.equals(ShapeType.LINE)) {
        shapeImpl = new Line();
      }
      shapes.put(type, shapeImpl);
    }
    return shapeImpl;
  }


}