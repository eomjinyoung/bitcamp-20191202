package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.service.BoardService;
import com.eomcs.util.RequestMapping;

@Component
public class BoardDetailController {

  @Autowired
  BoardService boardService;

  @RequestMapping("/board/detail")
  public void detail(HttpServletRequest request, HttpServletResponse response) {
    try {
      int no = Integer.parseInt(request.getParameter("no"));
      Board board = boardService.get(no);
      request.setAttribute("board", board);
      request.setAttribute("viewUrl", "/board/detail.jsp");

    } catch (Exception e) {
      request.setAttribute("error", e);
      request.setAttribute("url", "list");
    }
  }
}
