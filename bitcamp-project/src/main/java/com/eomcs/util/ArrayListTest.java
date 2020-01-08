package com.eomcs.util;

public class ArrayListTest {

  public static void main(String[] args) {
    
    ArrayList<String> a1 = new ArrayList<>();
    
    a1.add("aaa");
    a1.add("bbb");
    a1.add("ccc");
    a1.add("ddd");
    a1.add("eee");
    a1.add("fff");
    //a1.add(new Member()); // 컴파일 오류!
    
    System.out.println(a1.get(-1));
    System.out.println(a1.get(6));
    
    String oldValue = a1.set(0, "xxx");
    System.out.printf("%s ==> %s\n", oldValue, a1.get(0));
    
    a1.set(-1, "yyy");
    a1.set(6, "zzz");
    
    System.out.println("---------------");
    
    print(a1);
    
    a1.remove(-1);
    
    oldValue = a1.remove(5);
    System.out.printf("삭제 전(%s) ==> 삭제 후(%s)\n", oldValue, a1.get(0));
    
    System.out.println("---------------");
    
    print(a1);
  }
  
  static void print(ArrayList<String> arr) {
    String[] list = new String[arr.size()];
    arr.toArray(list);
    for (String e : list) {
      System.out.println(e);
    }
  }

}
