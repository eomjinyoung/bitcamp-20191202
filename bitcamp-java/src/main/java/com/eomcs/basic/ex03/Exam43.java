package com.eomcs.basic.ex03;

// 문자 리터럴(literal) - 작은 따옴표의 역할
// 
public class Exam43 {
  public static void main(String[] args) {
    System.out.println(0xac00); // 정수 리터럴
    System.out.println((char)0xac00); // 문자 코드임을 가리킨다.
    System.out.println('가'); // 문자 리터럴

    // (char)0xac00 == '가'
    // '문자' ==> 문자의 코드 값(0 ~ 65535)을 리턴한다.
    // 문자의 코드 값도 숫자로 다룰 수 있다.

    // 문자 코드를 정수로 간주하고 출력하라!
    System.out.println((int)'가');

    // '각' ==> 0xac01(44033) 을 리턴한다.
    // 따라서 다음과 같이 다른 숫자와 연산을 수행할 수 있다.
    System.out.println('각' + 1);
    System.out.println('각' - 1);
    // 문자 코드에 정수 값을 연산하는 순간 
    // 그 결과는 더이상 문자 코드가 아니라 일반적인 정수가 된다.
    // 그래서 println()은 그 값에 대한 문자를 출력하는 것이 아니라
    // 그냥 정수를 출력하는 것이다.

    // 해당 계산 결과를 문자 코드로 바꾸고 싶다면,
    // 이전에 했던대로 (char) 명령을 붙여라
    System.out.println((char)('각' + 1));
    System.out.println((char)('각' - 1));
  }
}





