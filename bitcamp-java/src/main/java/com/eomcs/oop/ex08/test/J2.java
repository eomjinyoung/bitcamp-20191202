package com.eomcs.oop.ex08.test;

public class J2 {

  // Student와 Teacher의 공통 분모를 뽑아서 수퍼 클래스를 정의 
  // => Generalization
  class Member {
    String email;
    String pwd;
    String name;
    String tel;
    
    void print() {
      System.out.println("회원 정보");
    }
  }

  // 대신 기존 클래스는 수퍼 클래스를 상속 받는다.
  class Student extends Member{
    int grade;
    boolean working;

    @Override
    void print() {
      System.out.println("학생 정보");
    }
  }

  class Teacher extends Member {
    int pay;
    String major;

    @Override
    void print() {
      System.out.println("강사 정보");
    }
  }

}




