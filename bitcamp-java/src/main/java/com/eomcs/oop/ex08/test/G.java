package com.eomcs.oop.ex08.test;

public class G extends Object {
  int a;
  void m1() {}
}

class G2 extends G {
  int b;
  
  void m2() {}
  void m2(int a) {} // 오버로딩: 같은 일을 하는 메서드에 대해 같은 이름을 부여.
  
  @Override
  void m1() {} // 오버라이딩 : 상속 받은 메서드를 서브 클래스의 역할에 맞게 재정의.
  
  void m1(int a) {} // 오버로딩 : 상속 받은 메서드에 대해서도 오버로딩 가능
}

class G3 extends G2 {
  int c;
  void m3() {}
  
  @Override
  void m1() {} // 오버라이딩
}

class TestG {
  public static void main(String[] args) {
    G3 obj1 = new G3();
    obj1.m1(); // G3의 m1() 호출
    
    G obj2 = new G3();
    obj2.m1(); // obj2가 실제 가리키는 G3가 오버라이딩 한 m1() 호출
    
    G obj3 = new G();
    obj3.m1(); // G의 m1() 호출
  }
}
