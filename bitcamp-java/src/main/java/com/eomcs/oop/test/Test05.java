package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test05 {
  public static void main(String[] args) {
    
    // 회원 정보를 담을 수 있는 메모리의 설계도
    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraining;
    }
    
    Member m1;
    m1 = new Member();
    m1.no = 100;
    System.out.println(m1); // 인스턴스에 부여된 고유 번호와 클래스명이 출력된다.
    System.out.println(m1.no);
    
    // 다른 레퍼런스에 주소를 저장할 수 있다.
    Member m2 = m1; 
    // m2는 m1과 같은 주소를 갖고 있다. 즉 같은 인스턴스를 가리킨다.
    System.out.println(m2.no);
    
    // m1 인스턴스를 m2 인스턴스로 복사한게 아니다.
    m1.no = 200;
    System.out.println(m2.no);
    
  }
  
}




