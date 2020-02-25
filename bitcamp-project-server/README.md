# 38_3 - 트랜잭션 적용 전: 코드 리팩토링하기


## 학습목표

- 여러 개의 DB 변경 작업을 한 작업 단위로 묶는 트랜잭션을 다룰 수 있다.
- `commit`과 `rollback`을 활용할 수 있다.
- 반복적으로 사용되는 코드를 별도의 메서드로 분리할 수 있다.
- 공통 코드를 별도의 클래스로 분리할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/domain/PhotoBoard.java 추가
- src/main/java/com/eomcs/dao/PhotoBoardDao.java 추가
- src/main/java/com/eomcs/dao/mariadb/PhotoBoardDaoImpl.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardListServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardDetailServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardAddServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardUpdateServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardDeleteServlet.java 추가
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: 클라이언트에게 입력 값을 요구하는 코드를 리팩토링 하라.

- com.eomcs.util.Prompt 추가
  - 입력 값을 요구하는 코드를 메서드로 정의한다.
  - getXxx() 메서드 정의.
- com.eomcs.lms.servlet.XxxServlet 변경
  - 입력 값을 요구하는 코드를 Prompt.getXxx() 호출로 대체한다.
  
