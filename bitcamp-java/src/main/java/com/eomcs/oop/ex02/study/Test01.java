package com.eomcs.oop.ex02.study;

public class Test01 {
  public static void main(String[] args) {
    
    Score s = new Score();
    
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    
    Score s2 = new Score();
    
    s2.name = "홍길동2";
    s2.kor = 80;
    s2.eng = 80;
    s2.math = 80;
    
    
    s.calculate();
    
    s2.calculate();
    
    System.out.println(s.sum);
    System.out.println(s.aver);
    
  }
}








