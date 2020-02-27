# 41 - Connection Pool 도입하기

## 학습목표

- Pooling 기법의 원리와 특징을 이해한다.
- Connection Pool을 구현할 수 있다.

### Pooling 기법

- 생성된 객체를 재사용 하는 것.
- 객체를 사용한 후에 버리지 않고 보관한다.
- 객체가 필요할 때 마다 빌려서 쓰고, 쓰고 난 후에는 반납한다.
- 이점:
  - 객체 생성에 소요되는 시간을 줄일 수 있다.
  - 가비지 생성을 억제하기 때문에 메모리 낭비를 줄일 수 있다.
- 예:
  - DB 커넥션 풀, 스레드 풀 등
- GoF의 'Flyweight' 디자인 패턴과 유사하다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/sql/PlatformTransactionManager.java 추가
- src/main/java/com/eomcs/lms/servlet/PhotoBoardAddServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardUpdateServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardDeleteServlet.java 변경
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: DB 커넥션 풀 객체를 생성하라.

- com.eomcs.sql.DataSource 추가
  - ConnectionFactory를 DataSource로 이름을 변경한다.
  - JDBC API에서는 커넥션 객체를 생성하고 관리하는 역할자를 DataSource로 정의하였다. 
  - 그래서 이 이름과 같게 만들자.
  - ConnectionFactory + Pooling 기능 = DataSource
  
### 훈련2: PlatformTransactionManager 를 변경하라.

- com.eomcs.sql.PlatformTransactionManager 변경
  - ConnectionFactory 대신 DataSource를 사용하도록 변경한다.

### 훈련3: DataSource를 사용하도록 DAO를 변경하라.

- com.eomcs.lms.dao.mariadb.XxxDaoImpl 변경
  - ConnectionFactory 대신 DataSource를 사용하도록 변경한다.
  
    
  
### 훈련2: PhotoBoardAddServlet에 트랜잭션 관리자를 적용하라.

- com.eomcs.lms.servlet.PhotoBoardAddServlet 변경
  - PlatformTransactionManager를 주입 받는다.
  - 트랜잭션 관리자를 통해 트랜잭션을 제어한다.
  
### 훈련3: PhotoBoardUpdateServlet에 트랜잭션 관리자를 적용하라.

- com.eomcs.lms.servlet.PhotoBoardUpdateServlet 변경
  - PlatformTransactionManager를 주입 받는다.
  - 트랜잭션 관리자를 통해 트랜잭션을 제어한다.
  
### 훈련4: PhotoBoardDeleteServlet에 트랜잭션 관리자를 적용하라.

- com.eomcs.lms.servlet.PhotoBoardDeleteServlet 변경
  - PlatformTransactionManager를 주입 받는다.
  - 트랜잭션 관리자를 통해 트랜잭션을 제어한다.

### 훈련5: DataLoaderListener에서 트랜잭션 관리자를 준비하라.

- com.eomcs.lms.DataLoaderListener 변경
  - PlatformTransactionManager 객체를 준비한다.

### 훈련6: 트랜잭션 관리자를 서블릿에 주입하라.

- com.eomcs.lms.ServerApp 변경
  - 맵에서 PlatformTransactionManager 객체를 꺼내 서블릿 객체에 주입한다.
  
### 훈련7: /photoboard/add, /photoboard/update, /photoboard/delete을 테스트 해 보라.