package day03Prac;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.Request;


// Servlet (Controller) : Request 받아 Response 생성 (브라우저 - 서버 중간처리자)
// JSP (View) : UI 표현 (HTML안에 자바코드 삽입 <% %> / <%= %>

// MVC (Model - View - Controller)
// Model : DB / JAVA     	(데이터처리)
// View : JSP				(화면)
// Controller :Servlet		(흐름제어 >> request > model 결정 > response JSP에 전달)

//1. HttpServlet 상속		  >> 서블릿은 HttpServlet 클래스 상속해 작성
//2. sevice 매서드 오버라이드  >> service 는 doGet/doPost 호출만 해줌 ++ 처리로직 추가
//3. Servlet 등록 @Webservlet ("/...")

@WebServlet ("/login")
public class Ex77MVC extends HttpServlet{
	
	  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		  String id = req.getParameter("id");
		  String pw = req.getParameter("pw");
		  
		  Ex77Service login = new Ex77Service();
		  boolean result = login.login(id, pw);
		  
		  //결과저장
		  req.setAttribute("data", result);
		  
		  //
		  req.getRequestDispatcher("/WEB-INF/views/Ex77View.jsp").forward(req, resp);
	}
	
	
}
