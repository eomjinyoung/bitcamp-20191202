# 40 - Connection을 스레드에 보관하기: ThreadLocal을 사용하여 스레드에 값 보관하기

## 학습목표

- ThreadLocal의 동작 원리를 이해한다.
- ThreadLocal을 사용하여 각 스레드에 값을 저장할 수 있다.

### Connection을 Thread에 보관하는 이유?

- 여러 개의 데이터 변경(insert/update/delete) 작업을 한 단위로 묶으려면 
  같은 Connection을 사용해야 한다.
- 왜? commit()/rollback()은 커넥션 객체에 대해 실행하기 때문이다.
- 즉 트랜잭션은 각 커넥션 별로 관리된다. 
- 그래서 스레드가 실행하는 데이터 변경 작업을 한 단위로 묶으려면 
  그 스레드가 수행하는 데이터 변경 작업은 같은 커넥션으로 실행해야 한다.
- DAO의 메서드가 실행될 때 사용하는 커넥션은 스레드에서 꺼낸다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/util/ConnectionFactory.java 추가
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/XxxDaoImpl.java 변경

## 실습  

### 훈련1: 커넥션 팩토리에서 생성한 Connection 객체를 스레드에 보관하라.

- com.eomcs.util.ConnectionFactory 변경
  - getConnection() 변경
    - 스레드에 보관된 Connection 객체가 없다면, 새로 생성하여 리턴한다.
    - 새로 생성한 Connection 객체는 스레드에 보관한다.
    - 스레드에 보관된 Connection 객체가 있다면 그 객체를 꺼내 리턴한다.
  
  