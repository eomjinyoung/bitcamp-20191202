# 31_2 - 애플리케이션을 시작하거나 종료할 때 작업할 옵저버를 추가한다.

## 학습목표

- 옵저버 디자인 패턴에 따라 옵저버를 정의할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/DataLoaderListener.java 추가
- src/main/java/com/eomcs/lms/App.java 변경

## 실습  

### 훈련 1: 애플리케이션을 시작하거나 종료할 때 데이터를 로딩하고 저장할 옵저버를 만든다.

- DataLoaderListener.java 추가
  - ApplicationContextListener를 구현한다.
  

### 훈련 2: DataLoaderListener 옵저버를 App 객체에 등록한다.

- App.java 변경
    - DataLoaderListener 객체를 생성한 후 App 객체에 등록한다.


### 훈련 3: App 객체에 옵저버를 등록하고 제거하고 실행시키는 기능을 추가한다.

- App.java (App.java.02)
  - 옵저버를 등록하는 메서드를 추가한다.
  - 옵저버를 제거하는 메서드를 추가한다.
  - 애플리케이션을 시작할 때 옵저버를 호출한다.
  - 애플리케이션을 종료할 때 옵저버를 호출한다.

### 훈련 4: 애플리케이션을 시작하거나 종료할 때 데이터를 로딩하고 저장하는 옵저버를 만들고 등록한다.
- DataLoaderListener.java (DataLoaderListener.java.01)
    - `ApplicationContextListener`를 구현한다. 즉 `Observer`를 만든다.
    - `App` 클래스에 있는 파일 입출력 코드를 이 클래스로 옮긴다.
    - 애플리케이션이 시작될 때 파일로부터 데이터를 읽는다.
    - 애플리케이션이 종료될 때 파일로 데이터를 쓴다.
- App.java (App.java.01)
    - `Observer` 디자인 패턴을 적용하기 전에 코드를 먼저 정리한다.
    - 기존의 스태틱 멤버를 인스턴스 멤버로 전환한다.
    - main()에 작성된 코드를 인스턴스 메서드로 분리하여 정리한다.
    - `Observer(예: ApplicationContextListener)`를 등록할 `addApplicationContextListener()`를 추가한다.

#### 실행 결과

`App`의 실행해도 이전에 저장한 데이터가 출력되지 않는다.
```
데이터를 읽어옵니다.
명령> /board/list

명령> /board/add
번호? 100
내용? test..
저장하였습니다.

명령> /board/list
100, test..              , 2018-11-09, 0

명령> quit
안녕!
데이터를 저장합니다.
```

종료한 후에 다시 실행해도 이전에 추가한 데이터가 출력되지 않는다.
```
데이터를 읽어옵니다.
명령> /board/list

```

이유는 DataLoaderListener에서 준비한 ArrayList와 LinkedList를 핸들러에서 사용하지 않기 때문이다. 다음 단계에서 처리한다.

### 과제 2: DataLoaderListener에서 준비한 객체를 다른 객체와 공유하라.

- ApplicationContextListener.java
    - `App` 객체와의 값을 공유하기 위해 `contextInitialized()` 와 `contextDestroyed()`에 Map 파라미터를 추가한다.
- DataLoaderListener.java
    - `ApplicationContextListener`의 변경에 따라 코드를 바꾼다.
    - 파일에서 수업, 회원, 게시글 데이터를 읽어 들인 후 그 데이터가 보관된 컬렉션 객체를 Map에 공유한다. 
- App.java
    - `Map` 객체를 통해 `Observer`와 `App` 사이에서 값을 공유한다.
    - `DataLoaderListener`가 준비한 컬렉션 객체를 핸들러에 넘긴다.

#### 실행 결과

이제 `App`의 실행 결과는 이전 버전과 같다. 애플리케이션을 실행하면 정상적으로 파일에서 데이터를 읽어오고, 종료하면 파일로 데이터를 출력할 것이다.


