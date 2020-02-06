package com.eomcs.lms.dao.json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

// 서브 클래스에게 공통 필드나 메서드를 상속해주는 역할을 하기 때문에
// => abstract
// 서브 클래스에게 상속 해주는 메서드 중에서 indexOf() 처럼 구현되지 않은 메서드가 있기 때문에
// => abstract
//
public abstract class AbstractJsonFileDao<T> {
  protected String filename;
  protected List<T> list;

  public AbstractJsonFileDao(String filename) {
    this.filename = filename;
    list = new ArrayList<>();
    loadData();
  }

  protected void loadData() {
    File file = new File(filename);
    // new TypeToken<ArrayList<T>>() {}.getType()
    try (BufferedReader in = new BufferedReader(new FileReader(file))) {
      @SuppressWarnings("serial")
      TypeToken<ArrayList<T>> typeToken = new TypeToken<ArrayList<T>>() {
        // TypeToken 이라는 추상 클래슬르 상속 받은 서브 클래스를 정의한다.
        // => 이 타입의 객체를 한 번만 사용할 것이기 때문에 익명 클래스로 정의한다.
        // => 따로 상속 받은 메서드를 오버라이딩 할 필요는 없다.
      };
      Type type = typeToken.getType();
      list = new Gson().fromJson(in, type);
      System.out.printf("총 %d 개의 객체를 로딩했습니다.\n", list.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  protected void saveData() {
    File file = new File(filename);

    try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
      out.write(new Gson().toJson(list));
      System.out.printf("총 %d 개의 객체를 저장했습니다.\n", list.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    }
  }

  // 서브 클래스들의 공통 메서드이기 때문에
  // => 수퍼 클래스에 정의한다.
  // 서브 클래스에서 접근할 수 있어야 하기 때문에
  // => protected
  // 서브 클래스마다 구현 방법이 다르기 때문에
  // => abstract
  // => 수퍼 클래스에서 구현할 수도 없고, 구현해 봐야 소용없다.
  // 서브 클래스에서 반드시 구현해야 할 메서드이기 때문에
  // => abstract
  //
  protected abstract <K> int indexOf(K key);
}


