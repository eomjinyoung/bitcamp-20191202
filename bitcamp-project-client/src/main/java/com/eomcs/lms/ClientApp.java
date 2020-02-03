// LMS 클라이언트
package com.eomcs.lms;

import java.net.Socket;

public class ClientApp {
  public static void main(String[] args) throws Exception {
    System.out.println("클라이언트 수업 관리 시스템입니다.");

    // 서버와 연결
    Socket socket = new Socket("localhost", 9999);

    // 소켓을 통해 데이터를 읽고 쓰는 도구를 준비한다.

  }
}
