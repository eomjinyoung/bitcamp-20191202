# 58_1 - Front Controller 설계 기법 적용하기

## 학습목표

- Front Controller 설계 기법의 이점을 이해한다.

### Front Controller

- 컨트롤러들의 공통 기능을 가져와서 통합 처리한다.
- 외부의 접점을 하나로 줄임으로써 요청을 제어하기가 쉬워진다.


## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/servlet/XxxDetailServlet.java 변경
- src/main/webapp/**/*.jsp 변경

## 실습  

### 훈련1: 프론트 컨트롤러 역할을 수행할 서블릿을 만든다.

- com.eomcs.lms.servlet.DispatcherServlet 추가
  - /app/* 요청을 처리한다.

