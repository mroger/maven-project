package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greet method.
   * @param someone someone name
   * @return greet string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
