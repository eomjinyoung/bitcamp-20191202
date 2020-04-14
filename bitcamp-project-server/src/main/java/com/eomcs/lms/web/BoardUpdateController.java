package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.service.BoardService;
import com.eomcs.util.RequestMapping;

@Component
public class BoardUpdateController {

  @Autowired
  BoardService boardService;

  @RequestMapping("/board/update")
  public void update(HttpServletRequest request, HttpServletResponse response) {
    try {
      if (request.getMethod().equals("GET")) {
        int no = Integer.parseInt(request.getParameter("no"));
        Board board = boardService.get(no);
        request.setAttribute("board", board);
        request.setAttribute("viewUrl", "/board/updateform.jsp");
        return;
      }

      request.setCharacterEncoding("UTF-8");
      Board board = new Board();
      board.setNo(Integer.parseInt(request.getParameter("no")));
      board.setTitle(request.getParameter("title"));

      if (boardService.update(board) > 0) {
        request.setAttribute("viewUrl", "redirect:list");
      } else {
        throw new Exception("변경할 게시물 번호가 유효하지 않습니다.");
      }

    } catch (Exception e) {
      request.setAttribute("error", e);
      request.setAttribute("url", "list");
    }
  }
}
