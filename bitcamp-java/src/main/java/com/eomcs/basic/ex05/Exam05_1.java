// 조건 연산자 => ? :
package com.eomcs.basic.ex05;

public class Exam05_1 {
    public static void main(String[] args) {
        // 조건연산자
        // 조건 ? 표현식1 : 표현식2
        // => 조건이 참이면 표현식1을 실행하고,
        //    조건이 거짓이면 표현식2를 실행한다.
        int age = 20;
        /*
        (age > 18) ? System.out.println("성인이다.") : 
                     System.out.println("미성년자이다.");  //컴파일 오류!
        */
        // 표현식 자리에는 문자가 되었든 숫자가 되었든 
        // 실행 결과가 놓여져야 한다.
        // 위의 System.out.println(...) 문장은 결과를 리턴하지 않는다.
        // 그래서 컴파일 오류이다.

        String message = (age > 18) ? "성년" : "미성년";
        System.out.printf("나이 %d는(은) %s이다.\n", age, message);
    }
}

// 표현식(expression)?
// - 작업을 수행한 후 결과를 리턴하는 명령이다.
//
// 문장(statement)?
// - 작업을 수행시키는 명령어이다.
//
// 문장과 표현식의 관계
// - statement 중에서 결과를 리턴하는 statement를 expression이라 부른다.
//