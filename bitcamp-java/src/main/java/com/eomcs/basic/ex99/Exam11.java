package com.eomcs.basic.ex99;

public class Exam11 {
  public static void main(String[] args) {
    // 값 출력하기
    // println() 사용법
    // => 출력 + 줄바꿈
    System.out.println(100);
    System.out.println(3.14);
    System.out.println(true);
    System.out.println('가');
    System.out.println("안녕!");

    System.out.println();

    // print() 사용법
    // => 출력 
    System.out.print(100);
    System.out.print(3.14);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕!");

    System.out.print('\n');

    System.out.print("OK!\n");
    System.out.print("NO!");

    // printf() 사용법
    // => printf("형식", 값1, 값2, ...);
    System.out.printf("\n이름: %s", "홍길동");
    System.out.printf("\n나이: %d", 20);

    System.out.printf("\n이름(나이): %s(%d)", "홍길동", 20);

    // 정수 삽입
    // %d: decimal
    // %x: hexadecimal
    // %c: character
    System.out.printf("\n %d, %x, %c", 65, 65, 65);

    // 삽입될 값 지정하기
    // => %값위치$d
    System.out.printf("\n %1$d, %1$x, %1$c", 65);

    // 논리 값 삽입
    System.out.printf("\n재직자: %s, %b", true, true);
    System.out.printf("\n나이: %s, %d", 20, 20);

    // 출력할 공간 확보
    System.out.printf("\n이름: [%s]", "홍길동");
    System.out.printf("\n이름: [%20s]", "홍길동"); // 오른쪽 정렬
    System.out.printf("\n이름: [%-20s]", "홍길동"); // 왼쪽 정렬 

    System.out.printf("\n숫자: [%d]", 12345); 
    System.out.printf("\n숫자: [%10d]", 12345); 
    System.out.printf("\n숫자: [%-10d]", 12345); 
    System.out.printf("\n숫자: [%010d]", 12345);
    System.out.printf("\n숫자: [%+010d], [%+010d]", 12345, -12345);

    // 일시 다루기
    java.util.Date today = new java.util.Date();
    today.setDate(9);

    System.out.printf("\n%s", today);

    // 날짜 객체에서 년,월,일,시,분,초,요일 추출하기
    System.out.printf("\n%tY, %ty", today, today); // 년도 추출
    System.out.printf("\n%tB, %tb", today, today); // 월 추출
    System.out.printf("\n%tm", today); // 월 추출
    System.out.printf("\n%td, %te", today, today); // 일 추출
    System.out.printf("\n%tA, %ta", today, today); // 요일 추출
    System.out.printf("\n%tH, %tI", today, today); // 시각 추출
    System.out.printf("\n%tM", today); // 분 추출
    System.out.printf("\n%tS, %tL,%tN", today, today, today); // 초, 밀리초, 나노초 추출
    System.out.printf("\n%tp, %Tp", today, today); // 오전/오후

    // 2019-12-12 12:37:45
    System.out.printf("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);

    String str;
    str = String.format("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);
    System.out.println(str);
  }
}