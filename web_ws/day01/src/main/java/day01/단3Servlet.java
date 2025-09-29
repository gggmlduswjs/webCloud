package day01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 3단 정보를 제공하는 서블릿 만들기
// 1. HttpServler을 상속받은 클래스 만들기
// 2. 약속된 매서드 service 오버라이드 - 응답내용 작성하기
		// HttpServletRequest (요청에 관련된 정보를 가지고 있는 객체)
		// HttpServletResponse (응답에 관련된 정보를 가지고 있는 객체)
// 3. url 매핑 ( /dan3), 서블릿으로 등록하기
// 4. 실행 (run)


@WebServlet("/dan3")
public class 단3Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 3단을 제공하기
		
		resp.setCharacterEncoding("utf-8"); //보내는 응답 데이터를 utf-8 인코딩해서 클라이언트에 보내라
		resp.setContentType("text/html;charset=utf-8"); //브라우저에게 html 형식으로 utf-8로 해석하라는 의미
//		resp.setContentType("text/plain;charset=utf-8"); //브라우저에게 html 형식으로 utf-8로 해석하라는 의미
		
		//3단 응답하기
		//1) 응답스트림 얻어오기

		PrintWriter out =resp.getWriter();
		
		//2) 요청한 클라이언트에게 3단 응답하기
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("3단");
		out.println(3*1 + "<br>");
		out.println(3*2+"<br>");
		out.println(3*3+"<br>");
		out.println(3*4+"<br>");
		out.println(3*5+"<br>");
		out.println(3*6+"<br>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	
	
}
