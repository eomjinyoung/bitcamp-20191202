package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.eomcs.lms.service.BoardService;
import com.eomcs.util.RequestMapping;

@Component
public class BoardDeleteController {

  @Autowired
  BoardService boardService;

  @RequestMapping("/board/delete")
  public void delete(HttpServletRequest request, HttpServletResponse response) {
    try {
      int no = Integer.parseInt(request.getParameter("no"));
      if (boardService.delete(no) > 0) {
        request.setAttribute("viewUrl", "redirect:list");
      } else {
        throw new Exception("삭제할 게시물 번호가 유효하지 않습니다.");
      }

    } catch (Exception e) {
      request.setAttribute("error", e);
      request.setAttribute("url", "list");
    }
  }
}
