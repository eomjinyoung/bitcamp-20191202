package com.eomcs.lms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app/*")
public class DispatcherServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  // GET,POST 요청 모두를 처리해야 한다.
  @Override
  protected void service(//
      HttpServletRequest request, //
      HttpServletResponse response) throws ServletException, IOException {

    // 서블릿 경로(/app) 다음에 오는 자원의 경로를 알아낸다.
    String pathInfo = request.getPathInfo();

    // 해당 서블릿을 실행한다.
    response.setContentType("text/html;charset=UTF-8");
    request.getRequestDispatcher(pathInfo).include(request, response);

    // 서블릿을 실행한 후 그 결과에 따라
    // JSP를 실행할지 Error 페이지를 출력할 지 결정한다.
    if (request.getAttribute("error") != null) {
      request.getRequestDispatcher("/error").forward(request, response);
      return;
    }

    // 서블릿을 정상적으로 실행했다면 서블릿이 알려준 JSP를 실행한다.
    String viewUrl = (String) request.getAttribute("viewUrl");
    if (viewUrl.startsWith("redirect:")) {
      response.sendRedirect(viewUrl.substring(9));
    } else {
      request.getRequestDispatcher(viewUrl).include(request, response);
    }
  }
}
