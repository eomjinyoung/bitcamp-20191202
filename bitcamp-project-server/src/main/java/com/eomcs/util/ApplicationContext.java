package com.eomcs.util;

import java.io.File;
import org.apache.ibatis.io.Resources;

// 역할:
// - 클래스를 찾아 객체를 생성한다.
// - 객체가 일을 하는데 필요로하는 의존 객체를 주입한다.
// - 객체를 생성과 소멸을 관리한다.
//
public class ApplicationContext {

  public ApplicationContext(String packageName) throws Exception {
    // 패키지의 실제 파일 시스템 경로를 알아낸다.
    System.out.println("ApplicationContext: " + packageName);

    String packagePath = packageName.replace('.', '/');
    System.out.println("ApplicationContext: " + packagePath);

    File path = Resources.getResourceAsFile(//
        packagePath /* 패키지명을 파일 시스템 경로로 바꿔서 전달한다. */);
    System.out.println("ApplicationContext: " + path.getAbsolutePath());

    // 해당 경로를 뒤져서 모든 클래스의 이름을 알아낸다.
    findClasses(path, packageName);
  }

  private void findClasses(File path, String packageName) {

    File[] files = path.listFiles();
    for (File f : files) {
      String classOrPackageName = //
          packageName + "." + f.getName().replace(".class", "");
      if (f.isFile()) {
        System.out.println("ApplicationContext: " + classOrPackageName);
      } else {
        findClasses(f, classOrPackageName);
      }
    }

  }

}
