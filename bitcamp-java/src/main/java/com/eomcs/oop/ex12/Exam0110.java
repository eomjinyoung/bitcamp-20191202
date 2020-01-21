// 람다(lambda) 문법
package com.eomcs.oop.ex12;

public class Exam0110 {

  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    Player p1;

    // 로컬 클래스
    class MyPlayer implements Player {
      @Override
      public void play() {
        System.out.println("실행!");
      }
    }

    p1 = new MyPlayer();
    p1.play();

  }
}


