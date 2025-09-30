package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿 만들기 ( 주문 정보 요청에 대한 응답 )
 * 1) HttpServlet 상속받기
 * 2) service() 메서드 오버라이드 ( 주문정보 만들기 )
 * 3) 서블릿 등록하기("/order.gs") => 매핑정보
 * 4) 사용자 입력정보(/order.gs?id=hong)
 * -> url에 ? 물음표 형식으로 데이터를 보내는 것을 쿼리스트링이라고 한다
 * */

@WebServlet("/order.gs")
public class OrderListServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//사용자 요청정보 꺼내오기
		String id = request.getParameter("id");
		System.out.println(id);
		
		//id에 대한 주문정보 가져오기
		//html 형식, css 주문정보를 맵형식으로 만들고 응답하기
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//데이터베이스 연동해서 해당 고객의 주문정보 가져오기
		out.println(id + " 주문정보");
		
		
		
		
		
	}
}
