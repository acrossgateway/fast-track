package com.service.system.dmc;

public class Problem {

  private String greeting;
  private String object;

  public Problem(String greeting, String object) {
    this.greeting = greeting;
    this.object = object;
  }

  public String getGreeting() {
    return this.greeting;
  }

  public String getObject() {
    return this.object;
  }
}
