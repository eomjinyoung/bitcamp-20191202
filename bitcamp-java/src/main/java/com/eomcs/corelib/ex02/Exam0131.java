// String - mutable vs immutable 객체
package com.eomcs.corelib.ex02;

public class Exam0131 {
  public static void main(String[] args) {
    // StringBuffer 객체는 mutable 객체이다.
    // 인스턴스의 데이터를 변경할 수 있다.
    // 원래의 문자열을 변경하고 싶을 때 사용하는 클래스이다.
    //
    StringBuffer buf = new StringBuffer("Hello");
    buf.replace(2, 4, "xx");
    System.out.println(buf); // 원본을 바꾼다.
  }
}





