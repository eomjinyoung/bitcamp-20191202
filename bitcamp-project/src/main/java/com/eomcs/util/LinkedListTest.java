package com.eomcs.util;

public class LinkedListTest {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");
    
    list.add(0,"xxx");
    
    print(list);
    
  }
  
  static void print(LinkedList list) {
    for (int i = 0; i < list.size; i++) {
      System.out.println(list.get(i));
    }
  }

}
