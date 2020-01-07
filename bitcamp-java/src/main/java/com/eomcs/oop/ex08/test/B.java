package com.eomcs.oop.ex08.test;

public class B {
  // field
  static int a; // 클래스 필드 = 스태틱 필드
  String b;     // 인스턴스 필드 = 논스태틱 필드
  
  // method
  static void m1() {}   // 클래스 메서드 = 스태틱 메서드
  int m2() {return 0;}  // 인스턴스 메서드 = 논스태틱 메서드
  
  // initializer block
  static {}  // 스태틱 블록
  {}         // 인스턴스 블록
  
  // constructor
  B() {}
  
  // nested class
  static class B1{} // static nested class
  class B2 {}       // non-static nested class = inner class
}
