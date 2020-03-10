# 43_1 - MyBatis SQL 맵퍼 프레임워크를 사용하여 JDBC 코드를 대체하기

## 학습목표

- Mybatis SQL 맵퍼의 특징과 동작 원리를 이해한다.
- Mybatis 퍼시스턴스 프레임워크를 설정하고 사용할 수 있다. 

## 실습 소스 및 결과

- src/main/java/com/eomcs/sql/TransactionCallback.java 추가
- src/main/java/com/eomcs/sql/TransactionTemplate.java 추가
- src/main/java/com/eomcs/lms/servlet/PhotoBoardAddServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardUpdateServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardDeleteServlet.java 변경

## 실습  

### 훈련1: 프로젝트에 MyBatis 라이브러리를 추가한다.

- build.gradle   
  - 의존 라이브러리 블록에서 `mybatis` 라이브러리를 등록한다.
- gradle을 이용하여 eclipse 설정 파일을 갱신한다.
  - `$ gradle eclipse`
- 이클립스에서 프로젝트를 갱신한다.
  
### 훈련2: `MyBatis` 설정 파일을 준비한다.

- com/eomcs/lms/conf/jdbc.properties
    - `MyBatis` 설정 파일에서 참고할 DBMS 접속 정보를 등록한다.
- com/eomcs/lms/conf/mybatis-config.xml
    - `MyBatis` 설정 파일이다.
    - DBMS 서버의 접속 정보를 갖고 있는 jdbc.properties 파일의 경로를 등록한다.
    - DBMS 서버 정보를 설정한다.
    - DB 커넥션 풀을 설정한다.

### 훈련3: BoardDaoImpl 에 Mybatis를 적용한다.

- com.eomcs.lms.dao.mariadb.BoardDaoImpl 클래스 변경
  - SQL을 뜯어내어 BoardMapper.xml로 옮긴다.
  - JDBC 코드를 뜯어내고 그 자리에 Mybatis 클래스로 대체한다.
- com/eomcs/lms/mapper/BoardMapper.xml
  - BoardDaoImpl 에 있던 SQL문을 이 파일로 옮긴다.
- com.eomcs.lms.DataLoaderListener 변경
  - SqlSessionFactory 객체를 준비한다.
  - BoardDaoImpl 에 주입한다.









