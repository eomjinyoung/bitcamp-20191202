# 32_3 - 게시물 관리에서 UI 기능을 분리하여 클라이언트에 적용하기 

## 학습목표

- 클라이언트와 서버 간에 객체를 주고 받을 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/domain/Board.java 추가
- src/main/java/com/eomcs/lms/ClientApp.java 변경

## 실습  

### 훈련 1: 31번 프로젝트에서 Board 클래스를 가져오라.

- com.eomcs.lms.domain 패키지 생성한다.
- Board.java 가져온다.

### 훈련 2: 31번 프로젝트에서 게시물 관리를 처리하는 Command 객체 가져오라.

- com.eomcs.lms.handler 패키지 생성한다.
- Command.java 인터페이스 가져온다.
- BoardXxxCommand.java 클래스 가져온다. 

### 훈련 3: 31번 프로젝트에서 util 패키지를 가져오라.

- com.eomcs.util 패키지를 생성한다.
- Prompt.java 가져온다. 

### 훈련 4: BoardListCommand에서 데이터를 가져올 때 서버에서 가져오도록 변경하라.

- ClientApp.java 변경한다.
  - 