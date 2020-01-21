package com.eomcs.oop.ex09.g;

public interface A {
  /* public abstract */ void m1();

  default void m2() {}

  static void m3() {
    System.out.println("오호라~~ 인터페이스도 스태틱 메서드를 가질 수 있네!");
  }
}
