# 45_1 - Java Proxy를 이용하여 DAO 구현체 자동 생성하기

## 학습목표

- Java Proxy의 구동 원리를 이해한다.
- Java Proxy를 이용하여 인터페이스 구현체를 자동으로 생성할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/service/BoardService.java 추가
- src/main/java/com/eomcs/lms/service/LessonService.java 추가
- src/main/java/com/eomcs/lms/service/MemberService.java 추가
- src/main/java/com/eomcs/lms/service/PhotoBoardService.java 추가
- src/main/java/com/eomcs/lms/service/impl/BoardServiceImpl.java 추가
- src/main/java/com/eomcs/lms/service/impl/LessonServiceImpl.java 추가
- src/main/java/com/eomcs/lms/service/impl/MemberServiceImpl.java 추가
- src/main/java/com/eomcs/lms/service/impl/PhotoBoardServiceImpl.java 추가
- src/main/java/com/eomcs/lms/ServerApp.java 변경
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/servlet/XxxServlet.java 변경

## 실습  

### 훈련1: InvocationHandler에서 SQL을 찾기 쉽도록 DAO 인터페이스 메서드명과 SQL ID를 일치시킨다.

- src/main/resources/com/eomcs/lms/mapper/XxxMapper.xml 변경
  - namespace 값을 인터페이스 전체 이름(fully-qualified name)과 일치시킨다.
  - 메서드에서 사용할 SQL은 메서드 이름과 일치시킨다.
  - MemberDao의 경우 findByEmailAndPassword()의 파라미터를 Map 타입으로 변경한다.
- com.eomcs.lms.dao.* 에서 DAO 구현체 모두 제거

### 훈련2: Dao 작업을 실제 수행할 클래스를 정의한다.

- com.eomcs.sql.DaoInvocationHandler 클래스 추가




