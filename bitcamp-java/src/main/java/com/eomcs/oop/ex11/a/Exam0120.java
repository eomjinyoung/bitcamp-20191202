// 클래스의 종류 : 중첩 클래스(nested class) 사용
package com.eomcs.oop.ex11.a;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0120 {
    
    // 클래스 안에 정의된 클래스를 "중첩 클래스(nested class)"라 한다.
    // => 특정 클래스 안에서만 사용될 클래스라면 그 클래스 내부에 선언함으로써 
    //    유지보수를 편리하게 만든다.
    // => 패키지 멤버 클래스로 선언하면 같은 이름으로 패키지 멤버를 중복해서 만들 수 없지만,
    //    클래스 안에 선언하면, 같은 이름으로 자신만의 기능을 수행하는 
    //    중첩 클래스를 여러 클래스 안에 만들 수 있다.
    // 1) static nested class
    // 2) non-static nested class = inner class
    static class JavaFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            if (name.endsWith(".java")) 
                return true; 
            return false; 
        }
    }
    
    public static void main(String[] args) throws Exception {
        File dir = new File(".");
        
        // 스태틱 중첩 클래스의 인스턴스를 생성한다.
        JavaFilter javaFilter = new JavaFilter();
        
        // 스태틱 중첩 클래스의 인스턴스를 필터로 사용하여 디렉토리 안의 목록을 추출한다.
        String[] names = dir.list(javaFilter);
        for (String name : names) {
            System.out.println(name);
        }

    }

}







