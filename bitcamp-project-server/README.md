# 56_4 - 포워딩과 인클루딩 활용

## 학습목표

- 포워딩과 인클루딩을 구현할 수 있다.
- 포워딩과 인클루딩의 동작을 이해한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/servlet/ErrorServlet.java 추가
- src/main/java/com/eomcs/lms/servlet/XxxServlet 변경


## 실습  

### 훈련1: 오류가 발생하면 ErrorServlet 으로 포워딩 한다.

- com.eomcs.lms.servlet.XxxServlet 변경
  - 정상적으로 실행했을 경우 목록 화면으로 리다이렉트 한다.
  - 오류가 발생했을 경우 ErrorServlet 으로 포워딩 한다.
- com.eomcs.lms.servlet.ErrorServlet 변경
  - ServletRequest 보관소에서 오류 객체를 꺼내 오류 내용을 출력한다. 
  

