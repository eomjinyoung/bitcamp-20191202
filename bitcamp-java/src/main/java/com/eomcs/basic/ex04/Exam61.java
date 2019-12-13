package com.eomcs.basic.ex04;

// 배열
public class Exam61 {
  public static void main(String[] args) {
    // 배열 사용전
    int kor, eng, math, soc, mus;

    // 배열 사용후
    int[] score = new int[5];
    int score2[] = new int[5]; // c-style

    // 배열에 값을 저장하는 방법
    score[0] = 100;
    score[1] = 90;
    score[2] = 80;
    score[3] = 70;
    score[4] = 60;

    //score[-1] = 100; // runtime error!
    //score[5] = 100; // runtime error!

    // 배열 레퍼런스와 인스턴스를 따로 선언
    int[] arr1 = null; // 주소가 0 => 의미? 메모리를 가리키지 않음

    //arr1[0] = 100; // runtime error;

    // 배열 인스턴스 생성
    arr1 = new int[5];
    arr1[0] = 100; // OK!
    arr1[1] = 100; // OK

    // 배열 사용
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);

    int[] arr2;

    // 배열 레퍼런스는 배열 인스턴스의 주소를 담는다.
    arr2 = arr1; // arr1에 저장된 배열 인스턴스의 주소를 담는다.

    System.out.println(arr1[0]);
    arr2[0] = 300;
    System.out.println(arr1[0]);

    // 배열 인스턴스의 각 항목은 생성되는 순간 기본 값으로 자동 초기화된다.
    // byte,short,int, long 배열: 0
    // float, double 배열: 0.0
    // boolea 배열: false;
    // char 배열: \u0000;
    System.out.println(arr1[2]);

    int[] arr3 = new int[3];
    arr3[0] = 30;

    arr2 = arr3;
    System.out.println(arr2[0]);

    arr1 = arr2;
    System.out.println(arr1[0]);

    // 그럼 arr1 에 저장되었던 기존 배열 인스턴스에는 
    // 어떻게 접근하는가?
    // => 처음 생성했던 배열 인스턴스의 주소를 갖고 있는 
    //    레퍼런스가 없기 때문에 접근할 수 없다.
    // => 이렇게 주소를 잃어버려 접근할 수 없는 메모리를 
    //    "가비지(garbage)"라고 부른다.
    // => 가비지는 JVM 실행 중에 메모리가 부족할 때 
    //    "가비지 수집기(garbage collector)"에 의해 
    //    메모리에서 해제된다.
    //    물론, JVM을 종료하면 당연히 JVM이 사용하던 
    //    모든 메모리는 OS에 반납되기 때문에 
    //    가비지 또한 반납될 것이다. 
    //
    // => 전산학에서는 "가비지"를 "dangling object" 라고 부른다.

    // 가비지 동작 
    // 1) 메모리가 부족할 때 
    // 2) CPU가 한가할 때

    // 배열 인스턴스 생성과 동시에 값 초기화시키기 
    int[] arr4 = new int[3];
    arr4[0] = 100;
    arr4[1] = 90;
    arr4[2] = 80;

    // 초기화시키는 값 개수 만큼 배열 항목이 생성된다.
    int[] arr5 = new int[] {100, 90, 80};

    // 인스턴스 생성과 동시에 값을 지정할 때는 
    // 배열 개수를 지정하면 안된다.
    //int[] arr6 = new int[3] {100, 90, 80}; // 컴파일 오류!

    // 배열 선언과 동시에 인스턴스를 초기화시킬 때는
    // new int[] 를 생략할 수 있다.
    int[] arr7 = {100, 90, 80};

    // 레퍼런스를 생성한 다음에 값을 초기화시킬 때는 
    // new int[] 생략할 수 없다.
    int[] arr8;
    //arr8 = {100, 90, 80}; // 컴파일 오류!
    arr8 = new int[] {100, 90, 80}; // OK!

  }
}