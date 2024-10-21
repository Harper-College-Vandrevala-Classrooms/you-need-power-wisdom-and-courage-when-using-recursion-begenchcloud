package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  @Test
  void testValueMethod() {
    
    assertEquals(1, calculator.value(1));
    assertEquals(3, calculator.value(2));
    assertEquals(6, calculator.value(3));
    assertEquals(10, calculator.value(4));
    assertEquals(15, calculator.value(5));
  }

  @Test
  void testAddMethod() {

    assertEquals(2, calculator.add(1, 1));
    assertEquals(9, calculator.add(2, 3));
    assertEquals(13, calculator.add(4, 2));
  }

  @Test
  void testSubtractMethod() {

    assertEquals(0, calculator.subtract(1, 1));
    assertEquals(-3, calculator.subtract(2, 3));
    assertEquals(7, calculator.subtract(4, 2));
  }
}
