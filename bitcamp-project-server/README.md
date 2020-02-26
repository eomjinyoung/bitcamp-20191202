# 39_2 - Connection 개별화하기: 커넥션 객체 생성에 Factory Method 패턴 적용하기


## 학습목표

- Factory Method 디자인 패턴의 원리와 사용 목적을 이해한다.
- Factory Method 설계 기법에 따라 구현할 수 있다.

### Factory Method 디자인 패턴

- 객체 생성 과정이 복잡할 경우에 사용하는 설계 기법이다.
- new 연산자를 이용하여 직접 객체를 생성하는 대신에 메서드를 통해 리턴 받는다.


## 실습 소스 및 결과

- src/main/java/com/eomcs/util/ConnectionFactory.java 추가
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/XxxDaoImpl.java 변경

## 실습  

### 훈련1: 커넥션을 생성할 때 팩토리 메서드를 사용하라.

- com.eomcs.util.ConnectionFactory 추가
  - Connection 객체를 생성하는 메서드를 추가한다.
- com.eomcs.lms.DataLoaderListener 변경
  - ConnectionFactory 객체를 준비한다.
  - DAO 구현체에 ConnectionFactory 객체를 주입한다.
- com.eomcs.lms.dao.mariadb.XxxDaoImpl 변경
  - 생성자에서 ConnectionFactory 객체를 받는다.
  - 직접 Connection 객체를 생성하는 대신에 
  ConnectionFactory 객체를 통해 Connection 얻는다.


  