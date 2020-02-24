package com.eomcs.lms.domain;

import java.io.Serializable;
import java.sql.Date;

public class PhotoBoard implements Serializable {

  private static final long serialVersionUID = 1L;

  int no;
  int lessonNo;
  String title;
  Date createdDate;
  int viewCount;

  @Override
  public String toString() {
    return "PhotoBoard [no=" + no + ", lessonNo=" + lessonNo + ", title=" + title + ", createdDate="
        + createdDate + ", viewCount=" + viewCount + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getLessonNo() {
    return lessonNo;
  }

  public void setLessonNo(int lessonNo) {
    this.lessonNo = lessonNo;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }


}
