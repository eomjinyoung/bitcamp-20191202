// 람다(lambda) 문법
package com.eomcs.oop.ex12;

public class Exam0112 {

  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    // 람다 문법
    Player p1 = () -> System.out.println("실행!");

    p1.play();
  }
}


