package com.service.system.dmc.util;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CalcTest {
  @Test
  @Ignore
  public void testAdd() {
    assertEquals(4, new Calc().add(1, 3));
  }
}
