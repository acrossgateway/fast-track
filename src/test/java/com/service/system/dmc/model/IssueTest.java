package com.service.system.dmc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IssueTest {
  static final Issue issue =
      Issue.builder().category("category").comment("comment").type("type").number(0).build();

  @Test
  void testGetCategory() {
    assertEquals("category", issue.getCategory());
  }

  @Test
  void testGetComment() {
    assertEquals("comment", issue.getComment());
  }

  @Test
  void testGetNumber() {
    assertEquals(0, issue.getNumber());
  }

  @Test
  void testGetType() {
    assertEquals("type", issue.getType());
  }
}
