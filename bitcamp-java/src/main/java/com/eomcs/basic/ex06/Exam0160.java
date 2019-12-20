package com.eomcs.basic.ex06;

import java.util.Scanner;

//# 흐름 제어문 - if ~ else if ~ else if ~ else
//
public class Exam0160 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("나이를 입력하세요? ");
    int age = keyScan.nextInt();

    if (age < 8) 
      System.out.println("아동입니다.");
    else {
      if (age < 14) 
        System.out.println("어린이입니다.");
      else {
        if (age < 19) 
          System.out.println("청소년입니다.");
        else {
          if (age < 65)
            System.out.println("성인입니다.");
          else
            System.out.println("노인입니다.");
        }
      }
    }
    System.out.println("------------------------------");
    
    // if ~ else ~는 한 문장이기 때문에 
    // if ~ else ~ 만 있다면 블록으로 묶지 않아도 된다.
    if (age < 8) 
      System.out.println("아동입니다.");
    else 
      if (age < 14) 
        System.out.println("어린이입니다.");
      else 
        if (age < 19) 
          System.out.println("청소년입니다.");
        else 
          if (age < 65)
            System.out.println("성인입니다.");
          else
            System.out.println("노인입니다.");
    
    System.out.println("------------------------------");
    
    // if ~ else 를 보기 좋게 정렬하자!
    // 실무에서는 다음과 같이 정렬한다.
    // 주의!
    // else if 라는 문법은 없다. 
    // 그냥 다음과 같이 정렬한 것이다.
    if (age < 8) 
      System.out.println("아동입니다.");
    else if (age < 14) 
      System.out.println("어린이입니다.");
    else if (age < 19) 
      System.out.println("청소년입니다.");
    else if (age < 65)
      System.out.println("성인입니다.");
    else
      System.out.println("노인입니다.");   
    
    keyScan.close();
  }
}