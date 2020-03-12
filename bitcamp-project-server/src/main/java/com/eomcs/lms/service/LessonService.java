package com.eomcs.lms.service;

import com.eomcs.lms.domain.Lesson;

public interface LessonService {
  Lesson get(int no) throws Exception;
}
