package com.eomcs.oop.ex05.test;

public class A {
  
  int v1;
  
  A() {
    this(100);
    System.out.println("A()");
  }
  
  A(int v1) {
    this.v1 = v1;
    System.out.println("A(int)");
  }
  
}
