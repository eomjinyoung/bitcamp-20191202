package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int[] no = new int[100];
    String[] title = new String[100];
    Date[] date = new Date[100];
    int[] count = new int[100];
    String response;
    
    System.out.print("번호? ");
    no[0] = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용
    
    System.out.print("내용? ");
    title[0] = keyboard.nextLine();
    
    date[0] = new Date(System.currentTimeMillis());
    count[0] = 0;
    
    System.out.println();
    
    System.out.print("계속 입력하시겠습니까?(Y/n) ");
    response = keyboard.nextLine();
    
    if (response.equalsIgnoreCase("y")) {
      System.out.print("번호? ");
      no[1] = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용
      
      System.out.print("내용? ");
      title[1] = keyboard.nextLine();
      
      date[1] = new Date(System.currentTimeMillis());
      count[1] = 0;
      
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        System.out.print("번호? ");
        no[2] = keyboard.nextInt();
        keyboard.nextLine(); // 줄바꿈 기호 제거용
        
        System.out.print("내용? ");
        title[2] = keyboard.nextLine();
        
        date[2] = new Date(System.currentTimeMillis());
        count[2] = 0;
        
        System.out.println();
        
        System.out.print("계속 입력하시겠습니까?(Y/n) ");
        response = keyboard.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
          System.out.print("번호? ");
          no[3] = keyboard.nextInt();
          keyboard.nextLine(); // 줄바꿈 기호 제거용
          
          System.out.print("내용? ");
          title[3] = keyboard.nextLine();
          
          date[3] = new Date(System.currentTimeMillis());
          count[3] = 0;
          
          System.out.println();
          
          System.out.print("계속 입력하시겠습니까?(Y/n) ");
          response = keyboard.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            System.out.print("번호? ");
            no[4] = keyboard.nextInt();
            keyboard.nextLine(); // 줄바꿈 기호 제거용
            
            System.out.print("내용? ");
            title[4] = keyboard.nextLine();
            
            date[4] = new Date(System.currentTimeMillis());
            count[4] = 0;
            
            System.out.println();
          }
        }
      }
    }
    
    keyboard.close();
    
    System.out.println();
    
    System.out.printf("%d, %s, %s, %d\n", no[0], title[0], date[0], count[0]);
    System.out.printf("%d, %s, %s, %d\n", no[1], title[1], date[1], count[1]);
    System.out.printf("%d, %s, %s, %d\n", no[2], title[2], date[2], count[2]);
    System.out.printf("%d, %s, %s, %d\n", no[3], title[3], date[3], count[3]);
    System.out.printf("%d, %s, %s, %d\n", no[4], title[4], date[4], count[4]);
  }
}








