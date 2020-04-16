package com.eomcs.lms.web;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.service.BoardService;
import com.eomcs.util.RequestMapping;

@Component
public class BoardController {

  @Autowired
  BoardService boardService;

  @RequestMapping("/board/add")
  public String add(HttpServletRequest request, Board board) throws Exception {
    if (request.getMethod().equals("GET")) {
      return "/board/form.jsp";
    }
    boardService.add(board);
    return "redirect:list";
  }

  @RequestMapping("/board/delete")
  public String delete(int no) throws Exception {
    if (boardService.delete(no) > 0) {
      return "redirect:list";
    } else {
      throw new Exception("삭제할 게시물 번호가 유효하지 않습니다.");
    }
  }

  @RequestMapping("/board/detail")
  public String detail(int no, Map<String, Object> model) throws Exception {
    Board board = boardService.get(no);
    model.put("board", board);
    return "/board/detail.jsp";
  }

  @RequestMapping("/board/list")
  public String list(Map<String, Object> model) throws Exception {
    List<Board> boards = boardService.list();
    model.put("list", boards);
    return "/board/list.jsp";
  }

  @RequestMapping("/board/update")
  public String update(//
      HttpServletRequest request, //
      Board board, //
      Map<String, Object> model) throws Exception {

    if (request.getMethod().equals("GET")) {
      model.put("board", boardService.get(board.getNo()));
      return "/board/updateform.jsp";
    }
    if (boardService.update(board) > 0) {
      return "redirect:list";
    } else {
      throw new Exception("변경할 게시물 번호가 유효하지 않습니다.");
    }
  }
}
