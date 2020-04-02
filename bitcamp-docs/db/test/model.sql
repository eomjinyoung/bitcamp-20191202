-- 수강신청
DROP TABLE IF EXISTS t_lesson_application RESTRICT;

-- 학생
DROP TABLE IF EXISTS t_students RESTRICT;

-- 강의
DROP TABLE IF EXISTS t_lessons RESTRICT;

-- 강사
DROP TABLE IF EXISTS t_teachers RESTRICT;

-- 매니저
DROP TABLE IF EXISTS t_managers RESTRICT;

-- 강의실
DROP TABLE IF EXISTS t_lesson_rooms RESTRICT;

-- 강의실사진
DROP TABLE IF EXISTS t_lesson_room_photos RESTRICT;

-- 강의매니저
DROP TABLE IF EXISTS t_lesson_managers RESTRICT;

-- 강의강사
DROP TABLE IF EXISTS t_lesson_teachers RESTRICT;

-- 회원
DROP TABLE IF EXISTS t_members RESTRICT;

-- 수강신청
CREATE TABLE t_lesson_application (
  application_no INTEGER  NOT NULL COMMENT '수강신청번호', -- 수강신청번호
  student_no     INTEGER  NOT NULL COMMENT '회원번호', -- 회원번호
  lesson_no      INTEGER  NOT NULL COMMENT '강의번호', -- 강의번호
  create_date    DATETIME NOT NULL DEFAULT now() COMMENT '신청일', -- 신청일
  status         INTEGER  NULL     COMMENT '상태' -- 상태
)
COMMENT '수강신청';

-- 수강신청
ALTER TABLE t_lesson_application
  ADD CONSTRAINT PK_t_lesson_application -- 수강신청 기본키
    PRIMARY KEY (
      application_no -- 수강신청번호
    );

-- 수강신청 유니크 인덱스
CREATE UNIQUE INDEX UIX_t_lesson_application
  ON t_lesson_application ( -- 수강신청
    student_no ASC, -- 회원번호
    lesson_no ASC   -- 강의번호
  );

ALTER TABLE t_lesson_application
  MODIFY COLUMN application_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '수강신청번호';

-- 학생
CREATE TABLE t_students (
  student_no      INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  photo           VARCHAR(255) NULL     COMMENT '사진', -- 사진
  post_no         VARCHAR(6)   NOT NULL COMMENT '우편번호', -- 우편번호
  basic_address   VARCHAR(100) NOT NULL COMMENT '기본주소', -- 기본주소
  detail_address  VARCHAR(100) NULL     COMMENT '상세주소', -- 상세주소
  final_education VARCHAR(40)  NOT NULL COMMENT '최종학력', -- 최종학력
  major           VARCHAR(40)  NOT NULL COMMENT '전공', -- 전공
  school_name     VARCHAR(40)  NOT NULL COMMENT '최종학교명', -- 최종학교명
  working         INTEGER      NOT NULL COMMENT '재직여부', -- 재직여부
  account         VARCHAR(20)  NULL     COMMENT '통장번호', -- 통장번호
  bank            VARCHAR(40)  NULL     COMMENT '은행명' -- 은행명
)
COMMENT '학생';

-- 학생
ALTER TABLE t_students
  ADD CONSTRAINT PK_t_students -- 학생 기본키
    PRIMARY KEY (
      student_no -- 회원번호
    );

-- 학생 유니크 인덱스
CREATE UNIQUE INDEX UIX_t_students
  ON t_students ( -- 학생
    bank ASC,    -- 은행명
    account ASC  -- 통장번호
  );

-- 강의
CREATE TABLE t_lessons (
  lesson_no      INTEGER      NOT NULL COMMENT '강의번호', -- 강의번호
  title          VARCHAR(255) NOT NULL COMMENT '강의명', -- 강의명
  start_date     DATE         NOT NULL COMMENT '시작일', -- 시작일
  end_date       DATE         NOT NULL COMMENT '종료일', -- 종료일
  total_hours    INTEGER      NOT NULL COMMENT '총강의시간', -- 총강의시간
  day_hours      INTEGER      NOT NULL COMMENT '일강의시간', -- 일강의시간
  quantity       INTEGER      NOT NULL COMMENT '모집인원', -- 모집인원
  content        TEXT         NOT NULL COMMENT '수업내용', -- 수업내용
  lesson_room_no INTEGER      NULL     COMMENT '강의실번호' -- 강의실번호
)
COMMENT '강의';

-- 강의
ALTER TABLE t_lessons
  ADD CONSTRAINT PK_t_lessons -- 강의 기본키
    PRIMARY KEY (
      lesson_no -- 강의번호
    );

-- 강의 인덱스
CREATE INDEX IX_t_lessons
  ON t_lessons( -- 강의
    title ASC -- 강의명
  );

ALTER TABLE t_lessons
  MODIFY COLUMN lesson_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의번호';

-- 강사
CREATE TABLE t_teachers (
  teacher_no INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  photo      VARCHAR(255) NULL     COMMENT '사진' -- 사진
)
COMMENT '강사';

-- 강사
ALTER TABLE t_teachers
  ADD CONSTRAINT PK_t_teachers -- 강사 기본키
    PRIMARY KEY (
      teacher_no -- 회원번호
    );

-- 매니저
CREATE TABLE t_managers (
  manager_no INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  photo      VARCHAR(255) NULL     COMMENT '사진', -- 사진
  position   VARCHAR(40)  NOT NULL COMMENT '직위', -- 직위
  fax        VARCHAR(20)  NULL     COMMENT '팩스' -- 팩스
)
COMMENT '매니저';

-- 매니저
ALTER TABLE t_managers
  ADD CONSTRAINT PK_t_managers -- 매니저 기본키
    PRIMARY KEY (
      manager_no -- 회원번호
    );

-- 강의실
CREATE TABLE t_lesson_rooms (
  lesson_room_no INTEGER     NOT NULL COMMENT '강의실번호', -- 강의실번호
  center         VARCHAR(40) NOT NULL COMMENT '센터', -- 센터
  name           VARCHAR(40) NOT NULL COMMENT '이름' -- 이름
)
COMMENT '강의실';

-- 강의실
ALTER TABLE t_lesson_rooms
  ADD CONSTRAINT PK_t_lesson_rooms -- 강의실 기본키
    PRIMARY KEY (
      lesson_room_no -- 강의실번호
    );

-- 강의실 유니크 인덱스
CREATE UNIQUE INDEX UIX_t_lesson_rooms
  ON t_lesson_rooms ( -- 강의실
    center ASC, -- 센터
    name ASC    -- 이름
  );

ALTER TABLE t_lesson_rooms
  MODIFY COLUMN lesson_room_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의실번호';

-- 강의실사진
CREATE TABLE t_lesson_room_photos (
  photo_no       INTEGER      NOT NULL COMMENT '사진파일번호', -- 사진파일번호
  lesson_room_no INTEGER      NOT NULL COMMENT '강의실번호', -- 강의실번호
  photo          VARCHAR(255) NOT NULL COMMENT '사진파일명' -- 사진파일명
)
COMMENT '강의실사진';

-- 강의실사진
ALTER TABLE t_lesson_room_photos
  ADD CONSTRAINT PK_t_lesson_room_photos -- 강의실사진 기본키
    PRIMARY KEY (
      photo_no -- 사진파일번호
    );

ALTER TABLE t_lesson_room_photos
  MODIFY COLUMN photo_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '사진파일번호';

-- 강의매니저
CREATE TABLE t_lesson_managers (
  lesson_no  INTEGER NOT NULL COMMENT '강의번호', -- 강의번호
  manager_no INTEGER NOT NULL COMMENT '회원번호' -- 회원번호
)
COMMENT '강의매니저';

-- 강의매니저
ALTER TABLE t_lesson_managers
  ADD CONSTRAINT PK_t_lesson_managers -- 강의매니저 기본키
    PRIMARY KEY (
      lesson_no,  -- 강의번호
      manager_no  -- 회원번호
    );

-- 강의강사
CREATE TABLE t_lesson_teachers (
  lesson_no  INTEGER NOT NULL COMMENT '강의번호', -- 강의번호
  teacher_no INTEGER NOT NULL COMMENT '회원번호' -- 회원번호
)
COMMENT '강의강사';

-- 강의강사
ALTER TABLE t_lesson_teachers
  ADD CONSTRAINT PK_t_lesson_teachers -- 강의강사 기본키
    PRIMARY KEY (
      lesson_no,  -- 강의번호
      teacher_no  -- 회원번호
    );

-- 회원
CREATE TABLE t_members (
  member_no   INTEGER     NOT NULL COMMENT '회원번호', -- 회원번호
  name        VARCHAR(40) NOT NULL COMMENT '이름', -- 이름
  email       VARCHAR(50) NOT NULL COMMENT '이메일', -- 이메일
  tel         VARCHAR(20) NOT NULL COMMENT '전화', -- 전화
  create_date DATETIME    NULL     DEFAULT now() COMMENT '등록일' -- 등록일
)
COMMENT '회원';

-- 회원
ALTER TABLE t_members
  ADD CONSTRAINT PK_t_members -- 회원 기본키
    PRIMARY KEY (
      member_no -- 회원번호
    );

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UIX_t_members
  ON t_members ( -- 회원
    email ASC -- 이메일
  );

-- 회원 인덱스
CREATE INDEX IX_t_members
  ON t_members( -- 회원
    name ASC -- 이름
  );

ALTER TABLE t_members
  MODIFY COLUMN member_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호';

-- 수강신청
ALTER TABLE t_lesson_application
  ADD CONSTRAINT FK_t_students_TO_t_lesson_application -- 학생 -> 수강신청
    FOREIGN KEY (
      student_no -- 회원번호
    )
    REFERENCES t_students ( -- 학생
      student_no -- 회원번호
    );

-- 수강신청
ALTER TABLE t_lesson_application
  ADD CONSTRAINT FK_t_lessons_TO_t_lesson_application -- 강의 -> 수강신청
    FOREIGN KEY (
      lesson_no -- 강의번호
    )
    REFERENCES t_lessons ( -- 강의
      lesson_no -- 강의번호
    );

-- 학생
ALTER TABLE t_students
  ADD CONSTRAINT FK_t_members_TO_t_students -- 회원 -> 학생
    FOREIGN KEY (
      student_no -- 회원번호
    )
    REFERENCES t_members ( -- 회원
      member_no -- 회원번호
    );

-- 강의
ALTER TABLE t_lessons
  ADD CONSTRAINT FK_t_lesson_rooms_TO_t_lessons -- 강의실 -> 강의
    FOREIGN KEY (
      lesson_room_no -- 강의실번호
    )
    REFERENCES t_lesson_rooms ( -- 강의실
      lesson_room_no -- 강의실번호
    );

-- 강사
ALTER TABLE t_teachers
  ADD CONSTRAINT FK_t_members_TO_t_teachers -- 회원 -> 강사
    FOREIGN KEY (
      teacher_no -- 회원번호
    )
    REFERENCES t_members ( -- 회원
      member_no -- 회원번호
    );

-- 매니저
ALTER TABLE t_managers
  ADD CONSTRAINT FK_t_members_TO_t_managers -- 회원 -> 매니저
    FOREIGN KEY (
      manager_no -- 회원번호
    )
    REFERENCES t_members ( -- 회원
      member_no -- 회원번호
    );

-- 강의실사진
ALTER TABLE t_lesson_room_photos
  ADD CONSTRAINT FK_t_lesson_rooms_TO_t_lesson_room_photos -- 강의실 -> 강의실사진
    FOREIGN KEY (
      lesson_room_no -- 강의실번호
    )
    REFERENCES t_lesson_rooms ( -- 강의실
      lesson_room_no -- 강의실번호
    );

-- 강의매니저
ALTER TABLE t_lesson_managers
  ADD CONSTRAINT FK_t_managers_TO_t_lesson_managers -- 매니저 -> 강의매니저
    FOREIGN KEY (
      manager_no -- 회원번호
    )
    REFERENCES t_managers ( -- 매니저
      manager_no -- 회원번호
    );

-- 강의매니저
ALTER TABLE t_lesson_managers
  ADD CONSTRAINT FK_t_lessons_TO_t_lesson_managers -- 강의 -> 강의매니저
    FOREIGN KEY (
      lesson_no -- 강의번호
    )
    REFERENCES t_lessons ( -- 강의
      lesson_no -- 강의번호
    );

-- 강의강사
ALTER TABLE t_lesson_teachers
  ADD CONSTRAINT FK_t_teachers_TO_t_lesson_teachers -- 강사 -> 강의강사
    FOREIGN KEY (
      teacher_no -- 회원번호
    )
    REFERENCES t_teachers ( -- 강사
      teacher_no -- 회원번호
    );

-- 강의강사
ALTER TABLE t_lesson_teachers
  ADD CONSTRAINT FK_t_lessons_TO_t_lesson_teachers -- 강의 -> 강의강사
    FOREIGN KEY (
      lesson_no -- 강의번호
    )
    REFERENCES t_lessons ( -- 강의
      lesson_no -- 강의번호
    );