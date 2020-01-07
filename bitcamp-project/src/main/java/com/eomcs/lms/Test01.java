package com.eomcs.lms;

import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;

public class Test01 {

  public static void main(String[] args) {
    
    Object obj = new String();
    System.out.println(obj.getClass());
    
    obj = new Board();
    System.out.println(obj.getClass());
    
    obj = new Board[100];
    System.out.println(obj.getClass());
    
    System.out.println(Board.class);
    
    System.out.println(Board[].class);

  }

}
