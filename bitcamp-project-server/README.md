# 54_2 - 출력 콘텐트에 HTML 형식 적용하기

## 학습목표

- HTML 태그를 사용할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/servlet/BoardListServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/MemberListServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/LessonListServlet.java 변경

## 실습  

### 훈련1: 게시글 목록을 출력할 때 HTML 형식으로 콘텐트를 출력한다.

- com.eomcs.lms.servlet.BoardListServlet 변경

### 훈련2: 웹브라우저에게 게시물 데이터 입력을 요구한다.

- com.eomcs.lms.servlet.BoardAddFormServlet 추가
  - 웹브라우저에게 게시물 데이터 입력을 요구하는 HTML을 보낸다.

### 훈련3: 웹브라우저가 보낸 데이터 받기

- com.eomcs.lms.ServerApp 변경
  - request-uri에서 자원의 경로와 데이터를 분리한다.
  - 예) /board/add?title=aaaa
  - 자원의 경로: /board/add
  - 데이터: title=aaaa

### 훈련4: 웹브라우저가 보낸 게시글 데이터 저장하기

- com.eomcs.lms.servlet.BoardAddServlet 변경
  - 웹브라우저에게 게시글 입력 결과를 보낸다.

### 훈련5: 게시글 상세 정보를 출력하기

- com.eomcs.lms.servlet.BoardDetailServlet 변경
  - 웹브라우저에게 게시글 상세 정보를 HTML 형식으로 만들어 보낸다.