package com.bitcamp.myproject;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    // 키보드에서 사용자가 입력한 값을 읽어 문자열이나 정수, 부동소수점 등으로 리턴하는 역할
    Scanner keyboard = new Scanner(System.in);
    
    keyboard.nextLine();

    
    System.out.println("커피이름: 브라질 옐로우 버번");
    System.out.println("가격: 7000");
    System.out.println("유통기한: 제조일로부터 1년 ");
    System.out.println("생산년도: 2019-01-02");
    System.out.println("로스팅일자: 2019-12-09");
  }
}
