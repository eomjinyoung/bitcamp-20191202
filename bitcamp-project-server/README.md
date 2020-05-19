# 62_1 - Facebook SNS 로그인 적용

## 학습목표

- Facebook 로그인을 적용할 수 있다.

## 실습 소스 및 결과

- src/main/webapp/package.json 생성
- src/main/webapp/WEB-INF/tiles/template.jsp 변경
- src/main/webapp/WEB-INF/tiles/footer.jsp 변경

## 실습  

### 훈련1: 로그인 폼에 페이스북 로그인 버튼을 추가

- /WEB-INF/views/auth/form.jsp 변경
  - 페이지북 로그인 버튼 태그 추가
  
### 훈련2: npm을 사용하여 bootstrap 라이브러리를 가져온다.

- 'npm install bootstrap --save'
  - npm이 접속하는 서버에서 bootstrap 라이브러리를 가져온다.
  - node_modules 라는 폴더를 생성하여 그 폴더 안에 라이브러리를 둔다.
  - '--save' 옵션은 package.json 파일에 의존 라이브러리 정보를 등록하게 해준다.
 
### 훈련3: npm을 사용하여 bootstrap이 의존하는 popperjs 라이브러리를 가져온다.

- 'npm install @popperjs/core --save'
  - npm이 접속하는 서버에서 popperjs 라이브러리를 가져온다.
  - node_modules 라는 폴더를 생성하여 그 폴더 안에 라이브러리를 둔다.
  - '--save' 옵션은 package.json 파일에 의존 라이브러리 정보를 등록하게 해준다.

### 훈련4: npm을 사용하여 jQuery 라이브러리를 가져온다.

- 'npm install jquery --save'
  - npm이 접속하는 서버에서 jquery 라이브러리를 가져온다.
  - node_modules 라는 폴더를 생성하여 그 폴더 안에 라이브러리를 둔다.
  - '--save' 옵션은 package.json 파일에 의존 라이브러리 정보를 등록하게 해준다.

### 훈련5: npm을 사용하여 sweetalert 라이브러리를 가져온다.

- 'npm install sweetalert --save'
  - npm이 접속하는 서버에서 sweetalert 라이브러리를 가져온다.
  - node_modules 라는 폴더를 생성하여 그 폴더 안에 라이브러리를 둔다.
  - '--save' 옵션은 package.json 파일에 의존 라이브러리 정보를 등록하게 해준다.





