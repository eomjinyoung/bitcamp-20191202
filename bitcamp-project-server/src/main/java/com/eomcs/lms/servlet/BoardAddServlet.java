package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import com.eomcs.lms.service.BoardService;
import com.eomcs.util.RequestMapping;

@Component
public class BoardAddServlet {

  BoardService boardService;

  public BoardAddServlet(BoardService boardService) {
    this.boardService = boardService;
  }

  @RequestMapping("/board/add")
  public void service(Scanner in, PrintStream out) throws Exception {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>게시글 입력</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<form>");
    out.println("내용: <textarea rows='5' cols='60'></textarea>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");

    // Board board = new Board();
    // board.setTitle(Prompt.getString(in, out, "제목? "));
    // boardService.add(board);
    // out.println("새 게시글을 등록했습니다.");

  }
}
