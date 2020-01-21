// 람다(lambda) 문법
package com.eomcs.oop.ex12;

public class Exam0311 {

  static interface Player {
    void play();
  }

  static void testPlayer(Player p) {
    p.play();
  }

  public static void main(String[] args) {
    // 익명 클래스
    Player p1 = new Player() {
      @Override
      public void play() {
        System.out.println("실행!");
      }
    };

    testPlayer(p1);

  }
}


