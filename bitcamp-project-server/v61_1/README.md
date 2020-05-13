# 61_1 - NPM 도입하여 JavaScript, CSS 라이브러리 관리하기

## 학습목표

- NPM을 사용하여 JavaScript와 CSS 라이브러리를 관리할 수 있다.
- NPM의 설정 파일을 읽고 해석할 수 있다.

## 실습 소스 및 결과

- src/main/webapp/package.json 생성
- src/main/webapp/WEB-INF/tiles/template.jsp 변경
- src/main/webapp/WEB-INF/tiles/footer.jsp 변경

## 실습  

### 훈련1: NPM 설정 파일(package.json)을 준비한다.

- webapp/package.json 파일 생성
  - 'src/main/webapp$ npm init' 실행
  - HTML에서 사용할 라이브러리를 두는 폴더에 생성한다.
  
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





