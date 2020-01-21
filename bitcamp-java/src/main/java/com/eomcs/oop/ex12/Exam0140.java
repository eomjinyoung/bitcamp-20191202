// 람다(lambda) 문법 - 파라미터
package com.eomcs.oop.ex12;

public class Exam0140 {

  static interface Player {
    void play(String name, int age);
  }

  public static void main(String[] args) {
    Player p1 = (String name, int age) -> System.out.printf("Hello, %s(%d)!\n", name, age);
    p1.play("홍길동", 20);

    p1 = (name, age) -> System.out.printf("Hello, %s(%d)!\n", name, age);
    p1.play("임꺽정", 30);

    /*
     * p1 = name, age -> System.out.printf("Hello, %s(%d)!\n", name, age); p1.play("임꺽정", 30);
     */
  }
}


