// 사용자 입력을 받는 코드를 별도의 메서드로 분리한다.
//
package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.ArrayList;

public class LessonHandler {
  
  ArrayList<Lesson> lessonList;
  
  public Scanner input;
  
  public LessonHandler(Scanner input) {
    this.input = input;
    this.lessonList = new ArrayList<>();
  }
  
  public void addLesson() {
    Lesson lesson = new Lesson();
    
    lesson.setNo(inputInt("번호? "));
    lesson.setTitle(inputString("수업명? "));
    lesson.setDescription(inputString("설명? "));
    lesson.setStartDate(inputDate("시작일? "));
    lesson.setEndDate(inputDate("종료일? "));
    lesson.setTotalHours(inputInt("총수업시간? "));
    lesson.setDayHours(inputInt("일수업시간? "));
    
    lessonList.add(lesson);
    
    System.out.println("저장하였습니다.");
  }
  
  public void listLesson() {
    // 수업 객체 목록을 복사 받을 배열을 준비하고, toArray()를 실행한다.
    // toArray()의 리턴 값은 파라미터로 넘겨준 배열의 주소이다.
    Lesson[] arr = this.lessonList.toArray(new Lesson[this.lessonList.size()]);
    for (Lesson l : arr) {
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          l.getNo(), l.getTitle(), 
          l.getStartDate(), l.getEndDate(), l.getTotalHours());
    }
  }
  
  public void detailLesson() {
    int index = indexOfLesson(inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 수업이 없습니다.");
      return;
    }
    
    Lesson lesson = this.lessonList.get(index);
    
    System.out.printf("번호: %d\n", lesson.getNo());
    System.out.printf("수업명: %s\n", lesson.getTitle());
    System.out.printf("설명: %s\n", lesson.getDescription());
    System.out.printf("시작일: %s\n", lesson.getStartDate());
    System.out.printf("종료일: %s\n", lesson.getEndDate());
    System.out.printf("총수업시간: %d\n", lesson.getTotalHours());
    System.out.printf("일수업시간: %d\n", lesson.getDayHours());
  }
  
  public void updateLesson() {
    int index = indexOfLesson(inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 수업이 없습니다.");
      return;
    }
    
    Lesson oldLesson = this.lessonList.get(index);
    Lesson newLesson = new Lesson();
    
    newLesson.setNo(oldLesson.getNo());
    
    newLesson.setTitle(inputString(
        String.format("수업명(%s)? ", oldLesson.getTitle()), 
        oldLesson.getTitle()));

    newLesson.setDescription(inputString("설명? ", oldLesson.getTitle()));
    
    newLesson.setStartDate(inputDate(
        String.format("시작일(%s)? ", oldLesson.getStartDate()), 
        oldLesson.getStartDate()));
    
    newLesson.setEndDate(inputDate(
        String.format("종료일(%s)? ", oldLesson.getEndDate()), 
        oldLesson.getEndDate()));
    
    newLesson.setTotalHours(inputInt(
        String.format("총수업시간(%d)? ", oldLesson.getTotalHours()), 
        oldLesson.getTotalHours()));
    
    newLesson.setDayHours(inputInt(
        String.format("일수업시간(%d)? ", oldLesson.getDayHours()), 
        oldLesson.getDayHours()));
    
    /*
    int oldValue = oldLesson.getDayHours();
    String label = "일수업시간(" + oldValue + ")? ";
    int newValue = inputInt(label, oldValue);
    newLesson.setDayHours(newValue);
    */
    
    if (oldLesson.equals(newLesson)) {
      System.out.println("수업 변경을 취소하였습니다.");
      return;
    }
    
    this.lessonList.set(index, newLesson);
    System.out.println("수업을 변경했습니다.");
  }
  
  public void deleteLesson() {
    int index = indexOfLesson(inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 수업이 없습니다.");
      return;
    }
    
    this.lessonList.remove(index);
    
    System.out.println("수업을 삭제했습니다.");
  }
  
  private int indexOfLesson(int no) {
    for (int i = 0; i < this.lessonList.size(); i++) {
      if (this.lessonList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
  
  private String inputString(String label) {
    System.out.print(label);
    return input.nextLine();
  }
  
  private String inputString(String label, String defaultValue) {
    System.out.print(label);
    String value = input.nextLine();
    if (value.length() == 0) {
      return defaultValue;
    }
    return value;
  }
  
  private int inputInt(String label) {
    System.out.print(label);
    return Integer.parseInt(input.nextLine());
  }
  
  private int inputInt(String label, int defaultValue) {
    System.out.print(label);
    String value = input.nextLine();
    if (value.length() == 0) {
      return defaultValue;
    }
    return Integer.parseInt(value);
  }
  
  private Date inputDate(String label) {
    System.out.print(label);
    return Date.valueOf(input.nextLine());
  }
  
  private Date inputDate(String label, Date defaultValue) {
    System.out.print(label);
    String value = input.nextLine();
    if (value.length() == 0) {
      return defaultValue;
    }
    return Date.valueOf(value);
  }
  
}




