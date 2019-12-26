// 기존의 클래스를 손대지 않고 새 기능만 추가한다.
// 어떻게? 상속 문법을 이용한다.
package com.eomcs.oop.ex05.d;

// 상속
// => 재사용할 기존 클래스를 지정한다.
// => 새 클래스에는 추가할 기능을 덧붙인다.
public class Sedan extends com.eomcs.oop.ex05.a.Car {
    // 인스턴스 변수 추가 
    boolean sunroof;
    boolean auto;
    
    public Sedan(String model, String maker, int capacity, 
            boolean sunroof, boolean auto) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
        this.sunroof = sunroof;
        this.auto = auto;
    }
    
}
