package com.eomcs.util;

public class ArrayListTest {

  public static void main(String[] args) {
    
    ArrayList a1 = new ArrayList();
    
    a1.add("aaa");
    a1.add("bbb");
    a1.add("ccc");
    a1.add("ddd");
    a1.add("eee");
    a1.add("fff");
    
    print(a1);
    
    a1.remove(0);
    
    System.out.println("---------------");
    
    print(a1);
  }
  
  static void print(ArrayList arr) {
    for (int i = 0; i < arr.size; i++) {
      System.out.println(arr.get(i));
    }
  }

}
