# 59_1 - Spring WebMVC 적용하기 II : 페이지 컨트롤러, MultipartResolver, ViewResolver

## 학습목표

- @RequestMapping, @GetMapping, @PostMapping의 사용법을 안다.
- 멀티파트 데이터를 처리하기 위해 MultipartResolver를 설정할 수 있다.
- ViewResolver의 동작원리를 이해한다.
- ViewResolver를 교체할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ContextLoaderListener.java 삭제
- src/main/java/com/eomcs/lms/servlet/DispatcherServlet.java 삭제
- src/main/java/com/eomcs/lms/filter/CharacterEncodingFilter.java 삭제
- src/main/java/com/eomcs/util/RequestHandler.java 삭제
- src/main/java/com/eomcs/util/RequestMapping.java 삭제
- src/main/java/com/eomcs/util/RequestMappingHandlerMapping.java 삭제
- src/main/java/com/eomcs/lms/web/XxxController.java 변경
- src/main/webapp/WEB-INF/web.xml 변경


## 실습  

### 훈련1: WebApplicationInitializer를 사용하여 DispatcherServlet을 설정한다.

- com.eomcs.lms.web.AppWebApplicationInitializer 추가 
- com.eomcs.lms.AppConfig 변경
  - ViewResolver 객체 등록
  - MultipartResolver 객체 등록
  - WebMVC 관련 애노테이션을 처리할 객체 등록 : @EnableWebMVC
 

### 훈련2: JSP 파일을 /WEB-INF/jsp/ 폴더로 옮긴다.

- src/main/webapp/**/*.jsp 를 /WEB-INF/jsp/ 로 옮긴다.

### 훈련3: 페이지 컨트롤러의 view name을 변경한다.

- com.eomcs.lms.web.*Controller 변경
  - @RequestMapping을 클래스 선언부에도 붙인다.
  - @RequestMapping 대신에 @GetMapping 또는 @PostMapping을 사용한다.
  - 리턴 값 변경
  - 

