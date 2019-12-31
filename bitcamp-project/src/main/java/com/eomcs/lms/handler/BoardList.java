package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Board;

public class BoardList {
  
  static final int DEFAULT_CAPACITY = 100;
  
  Board[] list;
  int size = 0;
  
  public BoardList() {
    this.list = new Board[DEFAULT_CAPACITY];
  }
  
  public BoardList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Board[DEFAULT_CAPACITY];
    else 
      this.list = new Board[capacity];
  }

  public Board[] toArray() {
    Board[] arr = new Board[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }

  public void add(Board board) {
    this.list[this.size++] = board;
  }
  
  public Board get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}










