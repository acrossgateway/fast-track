package com.service.system.dmc.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

  @Test
  public void testAdd() {
    assertEquals(4, new Calc().add(1, 3));
  }
}
