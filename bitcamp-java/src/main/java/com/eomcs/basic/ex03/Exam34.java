package com.eomcs.basic.ex03;

// 부동소수점 리터럴(literal) - 부동소수점을 메모리에 저장하기
// 
public class Exam34 {
  public static void main(String[] args) {
    
    // 4바이트 부동소수점 유효 자릿수 : 7자리
    System.out.println(3.141592f); // OK!
    System.out.println(3141.592f); // OK!
    System.out.println(31415.92f); // OK!
    System.out.println(314159.2f); // OK!
    System.out.println(314159.26f); // 값이 구겨진다.
    System.out.println(3.1415926f); // 값이 구겨진다.
    System.out.println(3.14159265f); // 값이 구겨진다.
    System.out.println(3.141592653f); // 값이 구겨진다.
    System.out.println(3.1415926535f); // 값이 구겨진다.

    // 8바이트 부동소수점 유효 자릿수 : 15자리
    System.out.println(3.141592653589793); // OK!
    System.out.println(31415926.53589793); // OK!
    System.out.println(314159265358979.3); // OK!

    // 16자리인 경우 일부 부동소수점의 값이 제대로 저장되지 않는다.
    System.out.println(914159265358979.3); // 값이 구겨진다.
    System.out.println(91415926.53589793); // OK!
    System.out.println(9.141592653589793); // OK!

    // 15자리인 경우 대부분 부동소수점의 값이 제대로 저장된다.
    System.out.println(91415926535897.3); // OK!
    System.out.println(91415926.5358973); // OK!
    System.out.println(9.14159265358973); // OK!

    // 부동소수점을 저장할 때 완벽하게 저장되지 않는 경우
    System.out.println(7 * 0.1);
  }
}

// 부동소수점을 2진수로 변환하는 규칙!
// => IEEE 754