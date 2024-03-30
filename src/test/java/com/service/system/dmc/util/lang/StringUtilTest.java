package com.service.system.dmc.util.lang;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {
  @Test
  public void testJoin() {
    assertEquals("apple,amazon", StringUtil.join(new String[] {"appl", "amazon"}, ","));
  }

  @Test
  public void testJoin2() {
    List<String> list = new ArrayList<>();
    list.add("appl");
    list.add("amazon");
    assertEquals("apple,amazon", StringUtil.join(list, ","));
  }
}
