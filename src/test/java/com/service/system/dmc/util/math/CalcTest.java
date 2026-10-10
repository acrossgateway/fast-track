package com.service.system.dmc.util.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalcTest {

  private static final Calc calc = new Calc();

  @Test
  public void test_add_two_positive_integers() {
    assertEquals(10, calc.add(7, 3));
  }

  @Test
  public void test_two_one_negative_integers() {
    assertEquals(-5, calc.add(-1, -4));
  }

  @Test
  public void test_subtraction_negative_result() {
    assertEquals(-2, calc.substract(1, 3));
  }

  @Test
  public void test_multiplication_by_zero() {
    assertEquals(0, calc.multiply(5, 0));
  }

  @Test
  public void test_divide_fraction_result() {
    Calc calc = new Calc();
    assertEquals(2, calc.devide(5, 2));
  }

  @Test
  public void test_division_by_zero_exception_handling() {
    try {
      new Calc().devide(5, 0);
      fail("Division by zero did not throw an exception");
    } catch (ArithmeticException e) {
    }
  }
}
