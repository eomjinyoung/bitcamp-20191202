package com.eomcs.util;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("aaa");
    l.add("bbb");
    l.add("ccc");
    l.add("ddd");
    
    l.remove(0);
    l.remove(0);
    l.remove(0);
    l.remove(0);
    
    
    print(l);
    
    l.add("xxx");
    l.add("yyy");
    l.add("zzz");
    
    print(l);
  }
  
  static void print(LinkedList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
  
}
