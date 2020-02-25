package com.eomcs.lms.domain;

import java.io.Serializable;

// 사진 게시글의 사진 첨부 파일 데이터를 저장하는 클래스
public class PhotoFile implements Serializable {
  private static final long serialVersionUID = 1L;

  int no;
  String filepath;
  int boardNo;

  @Override
  public String toString() {
    return "PhotoFile [no=" + no + ", filepath=" + filepath + ", boardNo=" + boardNo + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  public int getBoardNo() {
    return boardNo;
  }

  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }


}
