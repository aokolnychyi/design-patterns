package com.aokolnychyi.pattern.creational.singleton;

/**
 * Singleton that implements initialization-on-demand holder idiom.
 *
 * The static class definition LazyHolder within it is not initialized until the JVM determines that
 * LazyHolder must be executed. The static class LazyHolder is only executed when the static method
 * getInstance is invoked on the class HolderIdiomSingleton, and the first time this happens the JVM
 * will load and initialize the LazyHolder class.
 */
public class HolderIdiomSingleton {

  private static class LazyHolder {
    private static final HolderIdiomSingleton INSTANCE = new HolderIdiomSingleton();
  }

  public static HolderIdiomSingleton getInstance() {
    return LazyHolder.INSTANCE;
  }

  private HolderIdiomSingleton() {
  }
}
