// 증감 연산자 : 후위(post-fix) 증감 연산자 응용 II
package com.eomcs.basic.ex05;

public class Exam06_4 {
    public static void main(String[] args) {
        int i = 2;
        int result = i++ + i++ * i++;
        // 연산자 우선수위: 
        // 1) ++, -- 
        // 2) *, /, %
        // 3) +, -
        // 4) =
        // 
        // int result = 2 + 3 * 4;
        // int result = 2 + 12;
        // int result = 14;
        System.out.printf("%d, %d\n", i, result);

    }
}
