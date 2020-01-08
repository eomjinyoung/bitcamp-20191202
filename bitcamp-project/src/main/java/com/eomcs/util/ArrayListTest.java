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
    
    System.out.println(a1.get(-1));
    System.out.println(a1.get(6));
    
    String oldValue = (String) a1.set(0, "xxx");
    System.out.printf("%s ==> %s\n", oldValue, a1.get(0));
    
    a1.set(-1, "yyy");
    a1.set(6, "zzz");
    
    System.out.println("---------------");
    
    print(a1);
    
    a1.remove(-1);
    
    oldValue = (String) a1.remove(0);
    System.out.printf("삭제 전(%s) ==> 삭제 후(%s)\n", oldValue, a1.get(0));
    
    System.out.println("---------------");
    
    print(a1);
  }
  
  static void print(ArrayList arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }

}
