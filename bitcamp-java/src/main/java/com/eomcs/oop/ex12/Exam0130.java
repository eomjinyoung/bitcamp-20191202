// 람다(lambda) 문법 - 파라미터
package com.eomcs.oop.ex12;

public class Exam0130 {

  static interface Player {
    void play(String name);
  }

  public static void main(String[] args) {
    Player p1 = (String name) -> System.out.println("Hello, " + name + "!");
    p1.play("홍길동");

    p1 = (name) -> System.out.println("Hello, " + name + "!");
    p1.play("임꺽정");

    p1 = name -> System.out.println("Hello, " + name + "!");
    p1.play("유관순");
  }
}


