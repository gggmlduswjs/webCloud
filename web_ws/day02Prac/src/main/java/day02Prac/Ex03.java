package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 요청에 대한 응답을 처리하는 서블릿 ( 원하는 단을 서비스 )
 * 1) HttpServlet 상속받기
 * 2) service 메서드 오버라이드 ( 원하는 단을 제공하기)
 * 3) 서블릿 등록하기( @WebServlet("/dan") )
 * 4) 요청정보 정리하기(사용자 요청이 있는 경우)
 * 		- /dan?num=2
 * */

@WebServlet("/dan")
public class Ex03 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답데이터 한글설정
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String num_ =  request.getParameter("num");
		int num;
		if(num_ == null) {
			num = 2;
		}else {
			//숫자로 변환
			num = Integer.parseInt(num_);
			System.out.println(num);
		}
		
		//원하는 단
		PrintWriter out = response.getWriter();		//응답이 나가는 통로(스트림)
		out.println(num + "단");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println(".line{width:100px; border:1px solid black;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");	
		for(int i = 1; i <= 9; i++) {
			out.println( "<div class=\"line\">"+ num * i + "</div>" + "<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
