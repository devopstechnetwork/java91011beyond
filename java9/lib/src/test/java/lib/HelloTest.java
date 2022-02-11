/*
 * Copyright 2018-2022 Henri Tremblay.
 */
package lib;

import org.junit.Test;

public class HelloTest {

  private final Hello hello = new HelloStdout();

  @Test
  public void testApp() {
    hello.helloWorld();
  }

}
