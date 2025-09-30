package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿 만들기 : 책정보 제공 (책정보를 요청하면 책정보를 응답하는 서블릿 만들기
 * 책이름, 책저자, 책가격 => 클래스로 구현
 * 
 * 1) HttpServlet 상속받기
 * 2) service 메서드 오버라이드 (임의의 책정보 반환하기)
 * 3) 서블릿 등록하기("/book") => 매핑이름
 * */

@WebServlet("/book")
public class Ex04 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//한글설정
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//응답, 임의의 책정보
		PrintWriter out = response.getWriter();
		Book_04 book = new Book_04("처음해보는 Servlet & Jsp", "오정임", 28000);
//		out.println(book.toString());
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("table{border:1px solid black;} td{border:1px solid black;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");	
		out.println("<table>");	
		out.println("<tr>");	
		out.println("<td>" + book.getTitle() + "</td>");	
		out.println("<td>" + book.getAuthor() + "</td>");	
		out.println("<td>" + book.getPrice() + "</td>");	
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
