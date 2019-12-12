package com.eomcs.basic.ex99;

public class Exam23 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // 정수와 문자열 한 줄을 입력 받기
    System.out.print("입력>");
    int i1 = scanner.nextInt();
    int i2 = scanner.nextInt();
    String s = scanner.nextLine();

    System.out.println("---------------------------");

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(s);

    // nextInt()
    // => space, tab, new line 기호를 만나면 그 앞까지 읽은 입력 값을 
    //    int로 만들어 리턴한다.
    // => 현재 커서의 위치는 공백(white space; space/tab/new line)에 있다.
    //    즉 값을 읽고 난 후 공백을 제거하지 않는다.
    // => 그래서 다음 메서드는 공백부터 읽게 된다.
    // => nextInt()는 앞에 공백이 있으면 무시한다.
    //    다음 공백을 만날 때까지 읽는다.
    // 
    // 결론!
    // => nextInt() 다음에 nextLine()을 실행할 때
    //    nextLine()은 nextInt()가 읽은 값 다음부터 읽기 때문에
    //    기대하지 않은 값이 리턴 될 수 있다.
  }
}