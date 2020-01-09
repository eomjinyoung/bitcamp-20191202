package com.eomcs.lms.domain;

import java.sql.Date;

public class Lesson {
  
  private int no;
  private String title;
  private String description;
  private Date startDate;
  private Date endDate;
  private int totalHours;
  private int dayHours;
  
  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != Lesson.class)
      return false;
    
    Lesson other = (Lesson) obj;
    
    if (this.no != other.no)
      return false;
    
    if (!this.title.equals(other.title))
      return false;
    
    if (!this.description.equals(other.description))
      return false;
    
    if (this.startDate.compareTo(other.startDate) != 0)
      return false;
    
    if (this.endDate.compareTo(other.endDate) != 0)
      return false;
    
    if (this.totalHours != other.totalHours)
      return false;
    
    if (this.dayHours != other.dayHours)
      return false;
    
    return true;
  }
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
  public int getTotalHours() {
    return totalHours;
  }
  public void setTotalHours(int totalHours) {
    this.totalHours = totalHours;
  }
  public int getDayHours() {
    return dayHours;
  }
  public void setDayHours(int dayHours) {
    this.dayHours = dayHours;
  }
}









