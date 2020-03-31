# 55_1 - JavaEE 의 Servlet 기술 도입하기

## 학습목표

- JavaEE/JavaSE/JavaME 기술의 특징을 이해한다.
- JavaEE 기술의 용도의 버전에 대해 이해한다.
- JavaEE Implements(WAS; Web Application Server)의 상용버전과 무료버전을 안다.
- JavaEE 버전과 WAS 버전의 관계를 이해한다.
- Tomcat 서블릿 컨테이너를 설치하고 설정할 수 있다.
- Servlet 기술에 따라 클라이언트 요청을 처리할 클래스를 만들 수 있다.
- 웹 애플리케이션을 서블릿 컨테이너에 배치할 수 있다.
- 웹 애플리케이션을 실행할 수 있다.

## 실습 소스 및 결과

- build.gradle 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경
- src/main/java/com/eomcs/lms/servlet/XxxServlet.java 변경

## 실습  

### 훈련1: 서블릿 컨테이너를 설치 및 설정한다.

- tomcat.apache.org 사이트에서 서블릿 컨테이너를 다운로드 받는다.
- 특정 폴더에 압축을 풀고, 설정한다.
  - 관리자 ID/PWD를 등록한다.
    - $톰캣홈/conf/tomcat-users.xml
  - 관리자 로그인을 활성화시킨다.
    - $톰캣홈/conf/Catalina/localhost/manager.xml
- 톰캣 서버를 실행하고 웹 브라우저를 통해 접속 확인한다.

### 훈련2: JavaEE Servlet 기술을 사용하기 위한 라이브러리를 프로젝트에 적용한다.

- build.gradle 변경
  - search.maven.org 에서 'servlet-api'를 검색한다.
  - 의존 라이브러리 블록에 추가한다.
  - 의존 라이브러리 옵션은 compileOnly로 설정한다.
  - 왜? 'servlet-api'는 컴파일할 때만 사용할 것이기 때문이다. 
- 'gradle eclipse' 실행
  - 이클립스 설정 파일을 갱신한다.
- 이클립스 IDE의 프로젝트를 refresh 한다.

### 훈련2: JavaEE의 Servlet 기술을 사용하여 Spring IoC 컨테이너를 준비한다.

- com.eomcs.lms.ContextLoaderListener 변경
  - Servlet 기술에게 제공하는 ServletContextListener를 구현한다.
  - Spring IoC 컨테이너를 준비한다. 
- com.eomcs.lms.context 패키지 및 하위 클래스 삭제

### 훈련3: 기존의 서블릿 클래스를 JavaEE의 Servlet 규칙에 따라 변경한다.

- com.eomcs.lms.servlet.XxxServlet.java 변경


