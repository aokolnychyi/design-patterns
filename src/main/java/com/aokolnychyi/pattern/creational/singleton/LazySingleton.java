package com.aokolnychyi.pattern.creational.singleton;

/**
 * Singleton with lazy initialization.
 *
 * It postpones the creation of an instance until it is requested for the first time.
 */
public class LazySingleton {

  private static volatile LazySingleton INSTANCE = null;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (INSTANCE == null) {
      synchronized (LazySingleton.class) {
        // Double check
        if (INSTANCE == null) {
          INSTANCE = new LazySingleton();
        }
      }
    }
    return INSTANCE;
  }
}
