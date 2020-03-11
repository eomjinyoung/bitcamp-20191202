# 44_1 - MyBatis의 dynamic sql 문법 사용하기

## 학습목표

- Mybatis에서 동적 SQL 생성하는 방법을 안다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경
- src/main/java/com/eomcs/lms/mapper/BoardDaoImpl.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/LessonDaoImpl.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/MemberDaoImpl.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/PhotoBoardDaoImpl.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/PhotoFileDaoImpl.java 변경

## 실습  

### 훈련1: <sql>을 사용하여 공통 SQL 코드를 분리한다.

- src/main/resources/com/eomcs/lms/mapper/*Mapper.xml
  
### 훈련2: <foreach>를 사용하여 insert 문 생성하기

- com.eomcs.lms.servlet.PhotoBoardAddServlet 변경
  - 파일 목록을 한 번에 insert 하기
- com.eomcs.lms.servlet.PhotoBoardUpdateServlet 변경
  - 파일 목록을 한 번에 insert 하기  
- com.eomcs.lms.dao.PhotoFileDao 변경
  - insert(PhotoFile) 메서드를 insert(PhotoBoard) 로 변경한다.
- com.eomcs.lms.dao.mariadb.PhotoFileDaoImpl 변경
  - insert()를 변경한다.
- src/main/resources/com/eomcs/lms/mapper/PhotoFileMapper.xml 변경
  - insertPhotoFile SQL 변경한다.
  - <foreach>를 적용하여 여러 개의 값을 한 번에 insert 한다.
  
  
  
  
  
  
  
  
  