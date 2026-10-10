package com.service.system.dmc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IssueTest {

  @Test
  public void testConstructor() {
    Issue issue = new Issue(1, "domain", "model", "domain model");
    assertEquals(1, issue.getNumber());
    assertEquals("model", issue.getCategory());
    assertEquals("domain model", issue.getComment());
  }
}
