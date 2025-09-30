package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿 만들기 : 사용자가 입력한 수만큼 별 출력하기 (별 응답하기)
 * 
 * 1) HttpServlet 상속받기
 * 2) service 메서드 오버라이드
 * 3) 서블릿 등록하기("/star") => 매핑정보
 * 4) 사용자정보 전달 => /star?cnt=5
 * */

@WebServlet("/star")
public class Ex05 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//사용자로부터 값 얻어오기
		String cnt_ =  request.getParameter("cnt");
		int cnt;
		
		if(cnt_ == null) {
			cnt = 5;
		}else {
			cnt = Integer.parseInt(cnt_);		//"55" = > 55
		}
		
		PrintWriter out = response.getWriter();
		
		//별 응답하기
//		out.println("*");
		for(int i = 1; i <= cnt; i++) {
			out.println("*");
		}
	}
}
