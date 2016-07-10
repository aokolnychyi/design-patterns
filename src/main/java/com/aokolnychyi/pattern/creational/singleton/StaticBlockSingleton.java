package com.aokolnychyi.pattern.creational.singleton;

public class StaticBlockSingleton {

  private static final StaticBlockSingleton INSTANCE;

  static {
    try {
      INSTANCE = new StaticBlockSingleton();
    } catch (Exception e) {
      throw new RuntimeException("Initialization failed!", e);
    }
  }

  public static StaticBlockSingleton getInstance() {
    return INSTANCE;
  }

  private StaticBlockSingleton() {
    // ...
  }
}
