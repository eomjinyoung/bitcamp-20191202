// 람다(lambda) 문법
package com.eomcs.oop.ex12;

public class Exam0330 {

  static interface Calculator {
    int compute(int start, int end);
  }

  static void test(Calculator c) {
    System.out.printf("결과: %d\n", c.compute(1, 10));
  }

  public static void main(String[] args) {
    test((a, b) -> {
      int sum = 0;
      for (int i = a; i <= b; i++) {
        sum += i;
      }
      return sum;
    });
  }
}


