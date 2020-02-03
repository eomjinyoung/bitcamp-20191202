# 32_2 - 간단한 메시지를 서버에 전송하고 응답을 받기

## 학습목표

- 클라이언트를 서버와 통신 연결할 수 있다.
- 소켓을 통해 데이터를 입출력 할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ClientApp.java 변경

## 실습  

### 훈련 1: 서버와 연결하라.

- ClientApp.java 변경

### 훈련 2: 서버에 요청 메시지를 전송하고 응답 메시지를 수신하라.

- ClientApp.java 변경

### 훈련 3: 이클립스 IDE로 임포트 하라.

- 'build.gradle' 변경
  - 'eclipse' gradle 플러그인을 추가한다.
  - 'javaCompile'을 설정한다.
- '$ gradle eclipse' 실행
  - gradle을 실행하여 이클립스 설정 파일을 생성한다.
- 이클립스에서 프로젝트 폴더를 임포트한다.

### 훈련 4: 프로젝트 시작 클래스를 변경하라.

- 'ClientApp.java' 생성
  - 기존의 'App.java'의 클래스 이름을 변경한다.
  - 소스 코드를 정리한다.
  - '클라이언트 수업 관리 시스템입니다' 문구를 출력한다.
- 'src/test/java/ClientAppTest.java' 생성
  - 기존의 'AppTest.java'의 클래스 이름을 변경한다.
  - 소스 코드를 정리한다.
- ClientApp.java 를 실행하여 결과를 확인한다.    

