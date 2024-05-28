package jstlel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. 객체의 Scope (뱐수의 Scope랑 달라, 존속범위)
		 * 	  객체의 존재 범위
		 * 2. 객체가 오래 존속하는 순서
		 *    Application(Context) Scope > Session Scope > Request Cope > Page Scope
		 *    
		 * 3. EL이 이름으로 객체를 찾는 순서
		 *    Application(Context) Scope < Session Scope < Request Cope < Page Scope
		 * 
		 *    [주의] 같은 이름으로 여러 범위에 객체를 저장하는 경우 주의가 필요.
		 */
		
		// request scope
		UserVo vo3 = new UserVo();
		vo3.setNo(3L);
		vo3.setName("둘리3");
		request.setAttribute("vo", vo3);
		
		// session scope
		UserVo vo2 = new UserVo();
		vo2.setNo(2L);
		vo2.setName("둘리2");
		request.getSession(true).setAttribute("vo", vo2);
		
		// application Scope
		UserVo vo1 = new UserVo();
		vo1.setNo(1L);
		vo1.setName("둘리1");
		request.getServletContext().setAttribute("vo", vo1);
		
		request
			.getRequestDispatcher("WEB-INF/views/02.jsp")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
