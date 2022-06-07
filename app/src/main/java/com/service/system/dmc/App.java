package com.service.system.dmc;

public class App {

  public static void main(String[] args) {
    Problem problem = new Problem("hello", "world");
    System.out.println(problem.getGreeting() + " " + problem.getObject());
  }
}
