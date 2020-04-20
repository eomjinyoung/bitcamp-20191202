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
 

### 훈련1: ViewResolver를 InternalResourceViewResolver로 교체한다.

- 

