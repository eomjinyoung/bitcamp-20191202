// HashMap과 Iterator
package com.eomcs.corelib.ex08;

import java.util.HashMap;
import java.util.Set;

public class Exam0320 {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("윤봉길", 25);

    HashMap map = new HashMap();
    map.put("s01", v1);
    map.put("s02", v2);
    map.put("s03", v3);
    map.put("s04", v4);
    map.put("s05", v5);

    Set keys = map.keySet();

    map.remove("s01");
    map.remove("s02");
    map.remove("s03");

    // Set 객체를 통해 key 를 꺼낼 때,
    // 그 순간의 HashSet에 있는 key를 꺼낸다.
    // 즉 keySet()을 호출할 때 모든 key를 미리 목록을 만들어 리턴하지 않는다.
    for (Object key : keys) {
      System.out.println(key);
    }
  }

}







