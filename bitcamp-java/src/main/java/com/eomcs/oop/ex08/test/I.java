package com.eomcs.oop.ex08.test;

public class I extends Object {
  private int a;
  private int b;
  
  public int getA() { // getter
    return a;
  }
  public void setA(int a) { // setter
    this.a = a;
  }
  public int getB() { // getter
    return b;
  }
  public void setB(int b) { // setter
    this.b = b;
  }
  // getter/setter를 통칭하여 'property(프로퍼티)'라 부른다.
}

class TestI {
  public static void main(String[] args) {
    I obj = new I();
    //obj.a = 100;
    //obj.b = 100;
    
    obj.setA(100);
    obj.setB(100);
    
    System.out.println(obj.getA());
    System.out.println(obj.getB());
  }
}





