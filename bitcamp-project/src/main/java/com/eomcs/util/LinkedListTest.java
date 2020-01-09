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
    
    print(list);
    
    System.out.println(list.get(-1));
    System.out.println(list.get(7));
  }
  
  static void print(LinkedList list) {
    for (int i = 0; i < list.size; i++) {
      System.out.println(list.get(i));
    }
  }

}
