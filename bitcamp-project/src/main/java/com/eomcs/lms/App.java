package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  
  static class Board {
    int no;
    String title;
    Date date;
    int viewCount;
  }
  
  static final int BOARD_SIZE = 100;
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;
  
  public static void main(String[] args) {
    
    // LessonHandler의 메서드를 사용하기 전에 
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
    LessonHandler.keyboard = keyboard;
    
    // MemberHandler의 메서드를 사용하기 전에 
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해준다.
    MemberHandler.keyboard = keyboard;
    
    String command;
    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      
      switch (command) {
        case "/lesson/add":
          // 다른 클래스로 분리한 메서드를 호출할 때는
          // 클래스를 이름을 지정해야 한다.
          LessonHandler.addLesson();
          break;
        case "/lesson/list":
          LessonHandler.listLesson();
          break;
        case "/member/add":
          MemberHandler.addMember();
          break;
        case "/member/list":
          MemberHandler.listMember();
          break;
        case "/board/add":
          addBoard();
          break;
        case "/board/list":
          listBoard();
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }
      
    } while (!command.equalsIgnoreCase("quit"));
    
    System.out.println("안녕!");
    
    keyboard.close();
  }

  private static void listBoard() {
    for (int i = 0; i < boardCount; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }

  private static void addBoard() {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;
    
    boards[boardCount++] = board;
    System.out.println("저장하였습니다.");
  }


  

}






