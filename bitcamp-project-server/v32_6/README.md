# 32_6 - 커맨드 패턴을 적용하여 요청 처리 메서드를 객체화 하기 

## 학습목표

- 커맨드 패턴의 동작 원리를 인해한다.
- 커맨드 패턴을 코드에 적용할 수 있다. 

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련 1: 커맨드 패턴의 인터페이스 정의하라.

- com.eomcs.servlet 패키지를 생성한다.
- com.eomcs.servlet.Servlet 인터페이스를 정의한다.

### 훈련 2: 각각의 요청 처리 메서드를 인터페이스 규칙에 따라 클래스를 정의하라.
 
- listBoard()를 BoardListServlet 클래스로 정의한다.
- addBoard()를 BoardAddServlet 클래스로 정의한다.
  - detailBoard() : 게시물 조회 요청 처리
  - updateBoard() : 게시물 변경 요청 처리
  - deleteBoard() : 게시물 삭제 요청 처리
  - listMember() : 회원 목록 데이터 요청 처리
  - addMember() : 회원 데이터 등록 요청 처리
  - detailMember() : 회원 조회 요청 처리
  - updateMember() : 회원 변경 요청 처리
  - deleteMember() : 회원 삭제 요청 처리
  - listLesson() : 수업 목록 데이터 요청 처리
  - addLesson() : 수업 데이터 등록 요청 처리
  - detailLesson() : 수업 조회 요청 처리
  - updateLesson() : 수업 변경 요청 처리
  - deleteLesson() : 수업 삭제 요청 처리      
