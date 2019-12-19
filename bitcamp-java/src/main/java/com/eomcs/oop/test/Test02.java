package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test02 {
  public static void main(String[] args) {
    
    // 대신 자바는 다양한 종류의 데이터를 담을 수 있는 메모리를 설계하는 문법을 제공한다.
    
    // 예2: 회원 데이터를 저장할 메모리를 설계한다.
    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraining;
    }
    
    // 이렇게 개발자가 임의로 만든 데이터 타입을 
    // "사용자 정의 데이터 타입(user defined data type)"이라 부른다.
    // 개발자가 class 라는 문법으로 정의한 데이터 타입으로 
    // 메모리를 만들 때는 일반적인 방식으로 만들 수 없다.
    // new 명령을 사용해야 한다.
    // 준비된 메모리를 사용하기 위해서는 그 메모리의 주소를 변수에 보관해야 한다.
    // 이렇게 class 설계도로 만든 메모리의 주소를 저장하는 변수를 
    // "레퍼런스(reference)"라고 한다.
    
    Member m1 = new Member();
    
    // m1
    // - Member 설계도에 따라 준비된 메모리(인스턴스=객체)의 주소를 저장할 변수이다.
    //   이렇게 인스턴스의 주소를 저장하는 변수를 "레퍼런스"라고 한다.
    // - 다른 설계도로 만든 메모리의 주소를 저장할 수 없다.
    // - Member 설계도로 만든 메모리는 이 변수를 통해 접근할 수 있다.
    //
    // new Member()
    // - Member 설계도에 따라 메모리를 준비시키는 명령이다.
    // - 이 명령을 통해 생성된(사용할 수 있도록 준비된) 메모리를 
    //   "인스턴스(instance)"라고 한다.
    //   보통은 "객체(object)"라고 부른다.
    //
    
    // 사용법
    // - 레퍼런스를 통해 해당 메모리를 접근할 수 있다.
    m1.no = 100;
    m1.name = "홍길동";
    m1.birthYear = 2001;
    m1.height = 180.5f;
    m1.personalTraining = true;
    
    
    
    
  }
  
}




