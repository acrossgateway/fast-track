package com.service.system.dmc.util.lang;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

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
