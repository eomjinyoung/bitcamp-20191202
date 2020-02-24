# 38_1 - 트랜잭션 적용 전: 사진 게시판 추가하기


## 학습목표

- 여러 개의 DB 변경 작업을 한 작업 단위로 묶는 트랜잭션을 다룰 수 있다.
- `commit`과 `rollback`을 활용할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: `수업 사진 게시판` 데이터를 다룰 DAO를 생성하라.

- com.eomcs.lms.domain.PhotoBoard 추가
  - 사진 게시물의 데이터 타입을 정의한다.
- com.eomcs.lms.dao.PhotoBoardDao 인터페이스 추가
  - 사진 게시물의 CRUD 관련 메서드 호출 규칙을 정의한다.
- com.eomcs.lms.dao.mariadb.PhotoBoardDaoImpl 추가
  - PhotoBoardDao 인터페이스를 구현한다.
- com.eomcs.lms.DataLoaderListener 변경
  - PhotoBoardDao 객체를 생성한다.

### 훈련1: '/photoboard/list' 명령을 처리하라.

- com.eomcs.lms.servlet.PhotoBoardListServlet 추가
    - 사진 게시물의 목록을 출력한다.
- com.eomcs.lms.ServerApp 변경
    - `PhotoBoardListServlet` 객체를 생성하여 커맨드 맵에 보관한다.

`ClientApp` 실행 예:
```
명령> /photoboard/list
수업번호? 1
수업명: xxxxx
----------------------------------------------------
  1, 수업 오리엔테이션           , 2018-11-14, 0
  2, 1차 과제 발표            , 2018-11-14, 0
  3, null                , 2018-11-14, 0
  4, 과제 발표회              , 2018-11-14, 0
```
    
    
    
- com.eomcs.lms.servlet.PhotoBoardDetailServlet 추가
    - 특정 사진 게시물의 상세 정보를 출력한다.
- com.eomcs.lms.servlet.PhotoBoardAddServlet 추가
    - 사진 게시물을 등록한다.
- com.eomcs.lms.servlet.PhotoBoardUpdateServlet 추가
    - 사진 게시물을 변경한다. 
- com.eomcs.lms.servlet.PhotoBoardDeleteServlet 추가
    - 사진 게시물을 삭제한다. 
- com.eomcs.lms.DataLoaderListener 변경
    - `PhotoBoardDao` 객체를 생성하여 맵 객체에 보관한다.


  