# 56_1 - HttpServlet 클래스를 상속 받아서 서블릿 만들기

## 학습목표

- GET/POST 요청을 구분하여 처리할 수 있다.
- HttpServlet과 GenericServlet의 차이점을 이해한다.

## 실습 소스 및 결과

- build.gradle 변경
- src/main/webapp/index.html 추가


## 실습  

### 훈련1: 게시물 입력폼과 입력 처리 서블릿을 한 클래스로 합친다.

- com.eomcs.lms.servlet.BoardAddServlet 변경
  - HttpServlet을 상속 받는다.
  - BoardAddFormServlet의 코드를 doGet() 메서드로 옮긴다.
  - BoardAddServlet의 원래 있던 코드를 doPost() 메서드로 옮긴다.
- com.eomcs.lms.servlet.BoardListServlet 변경
  - 게시물 입력 링크의 주소를 '/board/add'로 변경한다.
- com.eomcs.lms.servlet.BoardAddFormServlet 삭제