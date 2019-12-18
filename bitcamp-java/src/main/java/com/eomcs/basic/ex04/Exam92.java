package com.eomcs.basic.ex04;

// 형변환 : 부동소수점 변수 ==> 정수 변수
public class Exam92 {
  
  public static void main(String[] args) {
    float f = 3.14f;
    double d = 3.14;
    
    int i;
    long l;
    
    //i = f; // 컴파일 오류!
    //i = l; // 컴파일 오류!
    //l = f; // 컴파일 오류!
    //l = d; // 컴파일 오류!
    
    // 부동소수점 값을 정수 변수에 강제로 저장시키려면 
    // 형변환(type conversion; type casting) 문법을 사용해야 한다.
    i = (int) f; // 소수점 이하의 수는 제거되고 정수만 저장된다.
    System.out.println(i);
    
    i = (int) d; // OK!
    System.out.println(i);
    
    l = (long) f; // OK!
    l = (long) d; // OK!
    
    // 이렇게 개발자가 명확하게 다른 형의 값을 저장하라고 지시하는 문법을 
    // "명시적 형변환(explicit type conversion/casting)"이라 한다.
  }
  
}













