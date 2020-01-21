package com.eomcs.oop.ex09.g;

public class Exam0120 implements A {
  @Override
  public void m1() {}

  @Override
  public void m2() {
    // default 메서드는 인터페이스에서 구현했기 때문에
    // 클래스에서는 구현하지 않아도 컴파일 오류가 발생하지 않는다.
  }

}
