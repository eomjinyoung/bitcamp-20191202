package com.eomcs.oop.ex08.test;

// package member class
class A1 {
  
}

// package member class 
class A2 {
  
}

// package member class 
public class A {
  
  //nested class
  //=> non-static nested class = inner class
  class X {}
  
  //=> static nested class
  static class X2 {}
  
  Object obj = new Object() {
    @Override
    public String toString() {
      return "익명클래스";
    }
  };
  
  void m() {
    // local class
    class Y {}
    
    // anonymous class
    Object obj = new Object() {
      @Override
      public String toString() {
        return "익명클래스";
      }
    };
    

  }

}
