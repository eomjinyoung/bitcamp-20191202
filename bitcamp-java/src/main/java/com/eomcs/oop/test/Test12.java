package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test12 {
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
    
    // 인스턴스를 3000개 만들 것이다.
    // 레퍼런스를 3000개 준비하라!
    
    // 다음과 같이 일반적인 방식으로 레퍼런스를 선언하면
    // 너무 길어져서 코딩할 수 없다.
    /*
    Member m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, 
      m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, 
      m21, m22, m23, m24, m25, m26, m27, m28, m29, m30;
    */
    // 이런 상황에서 배열을 사용하면 쉽게 해결할 수 있다.
    // 즉 배열을 이용하면 많은 레퍼런스 변수를 손쉽게 만들 수 있다.
    
    // 레퍼런스 배열의 주소도 또한 레퍼런스 변수에 담아야 한다.
    Member[] arr = new Member[3000];
    // 주의!
    // => Member 인스턴스 주소를 담을 레퍼런스 변수를 3000개 만든다.
    // => Member 인스턴스를 3000개 만드는 것이 아니다!!!!!!!!!!!!!!!!!!!!!!
    
    //arr[0].no = 100; // runtime 오류!
    
    int count = 0;
    while (count < 3000) {
      arr[count] = new Member();
      count++;
    }
    
    //arr[0].no = 100; // OK!
    
    // 강사님, 배열 문법을 이용하여 인스턴스를 3000개 만드는 방법은 없나요?
    // => 없다!
    
    System.out.println("OK!");
  }
  
}










