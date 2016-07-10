package com.aokolnychyi.pattern.creational.singleton;

/**
 * Singleton with eager initialization. <p> Instance is created independently of whether it is
 * needed.
 */
public class EagerSingleton {

  private static final EagerSingleton INSTANCE = new EagerSingleton();

  private EagerSingleton() {
  }

  public static EagerSingleton getInstance() {
    return INSTANCE;
  }
}
