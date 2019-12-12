package com.eomcs.basic.ex99;

public class Exam21 {
  public static void main(String[] args) {
    // 키보드 정보를 가져온다.
    java.io.InputStream keyboard = System.in;

    // 키보드 객체에 정수, 부동소수점, 논리값, 문자열을 끊어서 읽어 주는 
    // 도우미 객체를 붙인다.
    java.util.Scanner scanner = new java.util.Scanner(keyboard);

    // 키보드로부터 들어온 바이트 배열을 분석하여 
    // 줄바꿈 기호를 만나면 그 앞에 입력한 바이트 배열을 
    // 문자열로 변환하여 리턴한다.
    // 키보드로부터 줄바꿈 값이 들어오지 않으면 영원히 리턴하지 않는다.
    String s1 = scanner.nextLine();

    String s2 = scanner.nextLine();

    String s3 = scanner.nextLine();

    System.out.println("---------------------------");

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}