package com.eomcs.basic.ex03;

// 부동소수점 리터럴(literal) - 최소값과 최대값
// 
public class Exam33 {
  public static void main(String[] args) {
    // 8바이트 부동소수점 최소/최대 값
    System.out.println(Double.MAX_VALUE); 
    System.out.println(Double.MIN_VALUE);

    // 4바이트 부동소수점 최소/최대 값
    System.out.println(Float.MAX_VALUE); 
    System.out.println(Float.MIN_VALUE);

    // 개발자가 부동소수점의 정확한 범위를 계산하기가 쉽지않다.
    // 그래서 2진수 변환 규칙을 참고하여 
    // '유효자릿수'를 사용하여 값의 범위를 따진다.

    System.out.println(3.1415926535f); // 값이 구겨진다.
    System.out.println(3.141592653f); // 값이 구겨진다.
    System.out.println(3.14159265f); // 값이 구겨진다.
    System.out.println(3.1415926f); // 값이 구겨진다.
    System.out.println(3.141592f); // OK!
    System.out.println(3141.592f); // OK!
    System.out.println(31415.92f); // OK!
    System.out.println(314159.2f); // OK!
    System.out.println(314159.26f); // 값이 구겨진다.
    // 위 예제를 통해 일정 규칙을 찾을 수 있다.
    // => 4바이트 메모리에 저장할 수 있는 부동소수점은
    //    소수점의 위치에 상관없이 
    //    숫자의 개수가 7개이면 거의 정상적으로 저장하고 
    //    꺼낼 수 있다.
    //    이렇게 정상적으로 넣고 꺼낼 수 있는 부동소수점의 
    //    숫자 개수를 "유효자릿수"라고 부른다.
    // => 주의!
    //    7자리라 하더라도 값이 구겨질 수 있다.
    //    즉 정상적으로 저장되지 않을 수 있다.
    //    그래서 부동소수점은 메모리에서 꺼낸 값을 
    //    내부의 규칙에 따라 JVM이 보정해 준다.
    // => 100% 정확하게 저장되고 꺼내지 못하는 이유는?
    //    부동소수점을 2진수로 바꿀 때 IEEE 754 규칙에 따라 
    //    변경하는데, 이 규칙에서 일부 부동소수점은 
    //    2진수로 정확히 변경되지 못하는 문제가 있다.
    //

    System.out.println((1.1f + 0.2f) == 1.3f);
  }
}