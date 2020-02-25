# 38_2 - 트랜잭션 적용 전: 사진 게시글에 첨부파일 추가하기


## 학습목표

- 여러 개의 DB 변경 작업을 한 작업 단위로 묶는 트랜잭션을 다룰 수 있다.
- `commit`과 `rollback`을 활용할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/domain/PhotoBoard.java 추가
- src/main/java/com/eomcs/dao/PhotoBoardDao.java 추가
- src/main/java/com/eomcs/dao/mariadb/PhotoBoardDaoImpl.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardListServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardDetailServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardAddServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardUpdateServlet.java 추가
- src/main/java/com/eomcs/servlet/PhotoBoardDeleteServlet.java 추가
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: `수업 사진 게시판`에 사진 파일을 첨부하는 기능을 추가하라.

- com.eomcs.lms.domain.PhotoFile 추가
  - 사진 파일의 타입을 정의한다.
- com.eomcs.lms.dao.PhotoFileDao 인터페이스 추가
  - 사진 파일의 CRUD 관련 메서드 호출 규칙을 정의한다.
- com.eomcs.lms.dao.mariadb.PhotoFileDaoImpl 추가
  - PhotoFileDao 인터페이스를 구현한다.
- com.eomcs.lms.DataLoaderListener 변경
  - PhotoFileDao 객체를 생성한다.

### 훈련2: '/photoboard/add' 명령을 처리하라.

사진 게시글을 입력할 때 사진 파일을 첨부할 수 있게 변경한다.

- com.eomcs.lms.dao.mariadb.PhotoBoardDaoImpl 변경
  - insert() 메서드를 변경한다.
  - insert 한 후에 자동 증가 PK 값을 리턴 받는다.
- com.eomcs.lms.servlet.PhotoBoardAddServlet 변경
  - LessonDao 객체를 주입 받아 수업 번호의 유효성을 검사한다.
  - 사진 게시글을 입력 받을 때 첨부 파일도 입력 받는다.
- com.eomcs.lms.ServerApp 변경
  - `PhotoBoardListServlet` 객체를 생성하여 커맨드 맵에 보관한다.

`ClientApp` 실행 예:
```
명령> /photoboard/add
제목?
ok
수업 번호?
1
최소 한 개의 사진 파일을 등록해야 합니다.
파일명 입력 없이 그냥 엔터를 치면 파일 추가를 마칩니다.
사진 파일?
   <== 입력 없이 엔터를 치면?
최소 한 개의 사진 파일을 등록해야 합니다.
사진 파일?
a1.gif
사진 파일?
a2.gif
사진 파일?
a3.gif
사진 파일?

사진을 저장했습니다.
```


    
### 훈련2: '/photoboard/detail' 명령을 처리하라.

- com.eomcs.lms.domain.PhotoBoard 변경
  - 수업 정보를 담을 Lesson 타입의 인스턴스 필드를 추가한다.
- com.eomcs.lms.dao.mariadb.PhotoBoardDaoImp 변경
  - findByNo(사진게시글번호) 메서드 변경한다.
  - 사진 게시글의 상세정보를 가져올 때 lms_photo와 lms_lesson을 조인한다.
  - lms_photo 데이터는 PhotoBoard에 저장하고, lms_lesson 데이터는 Lesson에 저장한다. 
- com.eomcs.lms.servlet.PhotoBoardDetailServlet 추가
    - 사진 게시물의 상세정보를 출력한다.
- com.eomcs.lms.ServerApp 변경
    - `PhotoBoardDetailServlet` 객체를 생성하여 커맨드 맵에 보관한다.

`ClientApp` 실행 예:
```
명령> /photoboard/detail
번호?
6
제목: test1
작성일: 2018-11-14
조회수: 0
수업명: xxxx

명령> /photoboard/detail
번호?
5
해당 번호의 사진 게시글이 없습니다.
```

### 훈련3: '/photoboard/add' 명령을 처리하라.

- com.eomcs.lms.servlet.PhotoBoardAddServlet 추가
    - 사진 게시물을 입력한다.
- com.eomcs.lms.ServerApp 변경
    - `PhotoBoardAddServlet` 객체를 생성하여 커맨드 맵에 보관한다.

`ClientApp` 실행 예:
```
명령> /photoboard/add
제목?
test1
수업 번호?
2
사진을 저장했습니다.

명령> /photoboard/add
제목?
test1
수업 번호?
200
수업 번호가 유효하지 않습니다.
```

### 훈련4: '/photoboard/update' 명령을 처리하라.

- com.eomcs.lms.servlet.PhotoBoardUpdateServlet 추가
    - 사진 게시물을 변경한다. 
- com.eomcs.lms.ServerApp 변경
    - `PhotoBoardUpdateServlet` 객체를 생성하여 커맨드 맵에 보관한다.

`ClientApp` 실행 예:
```
명령> /photoboard/update
번호?
6
제목(test1)?
test1...xx
사진을 변경했습니다.

명령> /photoboard/update
번호?
600
해당 번호의 사진 게시글이 없습니다.
```

### 훈련5: '/photoboard/delete' 명령을 처리하라.

- com.eomcs.lms.servlet.PhotoBoardDeleteServlet 추가
    - 사진 게시물을 삭제한다. 
- com.eomcs.lms.ServerApp 변경
    - `PhotoBoardDeleteServlet` 객체를 생성하여 커맨드 맵에 보관한다.

`ClientApp` 실행 예:
```
명령> /photoboard/delete
번호?
6
사진 게시글을 삭제했습니다.

명령> /photoboard/delete
번호?
600
해당 번호의 사진 게시글이 없습니다.
```

