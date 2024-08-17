package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

  private final Calc c = new Calc();

  @Test
  public void testAddition() {
    assertEquals(4, c.add(2, 2));
  }

  @Test
  public void testSubtraction() {
    assertEquals(2, c.subtract(4, 2));
  }

  public class Calc {

    public int add(int a, int b) {
      return a + b;
    }

    public int subtract(int a, int b) {
      return a - b; // a - b
    }
  }
}
