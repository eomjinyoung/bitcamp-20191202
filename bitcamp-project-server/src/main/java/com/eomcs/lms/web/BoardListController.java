package com.eomcs.lms.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.service.BoardService;
import com.eomcs.util.RequestMapping;

@Component
public class BoardListController {

  @Autowired
  BoardService boardService;

  @RequestMapping("/board/list")
  public void list(HttpServletRequest request, HttpServletResponse response) {
    try {
      List<Board> boards = boardService.list();
      request.setAttribute("list", boards);
      request.setAttribute("viewUrl", "/board/list.jsp");

    } catch (Exception e) {
      request.setAttribute("error", e);
      request.setAttribute("url", "list");
    }
  }
}
