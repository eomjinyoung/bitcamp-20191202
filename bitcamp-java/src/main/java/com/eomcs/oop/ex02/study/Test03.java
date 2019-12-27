package com.eomcs.oop.ex02.study;

public class Test03 {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();
    
    c1.name = "봉봉";
    c1.type = 1;
    c1.color = "빨강";
    c1.speed = 0;
    c1.energy = 100;
    c1.power = 200;
    
    c2.name = "호호";
    c2.type = 2;
    c2.color = "검정";
    c2.speed = 0;
    c2.energy = 100;
    c2.power = 300;
    
    c1.speedUp();
    c1.speedUp();
    c2.speedUp();
    
    System.out.printf("c1의 속도: %d\n", c1.speed);
    System.out.printf("c2의 속도: %d\n", c2.speed);
    
    System.out.printf("c1 vs c2 의 힘: %d\n", 
        c1.comparePower(c2));
    
  }
}





