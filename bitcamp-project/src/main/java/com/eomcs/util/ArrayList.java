package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {
  
  static final int DEFAULT_CAPACITY = 3;
  
  Object[] list;
  int size = 0;
  
  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }
  
  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else 
      this.list = new Object[capacity];
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  public E[] toArray(Class arrayType) {
    // copyOf() 메서드야,
    // arrayType 에 지정된 배열을 size 만큼 만들어라.
    // 그리고 list 배열에 저장된 주소를 새로 만든 배열에 복사하라.
    // 마지막으로 새로 만든 배열의 주소를 리턴하라!
    return (E[]) Arrays.copyOf(this.list, this.size, arrayType);
  }

  public void add(E obj) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = obj;
  }
  
  @SuppressWarnings("unchecked")
  public E get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return (E)this.list[idx];
    } else {
      return null;
    }
  }
}










