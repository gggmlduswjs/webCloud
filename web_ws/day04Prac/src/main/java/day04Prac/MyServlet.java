package day04Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 (하나의 요청을 처리하는 서버측의 작은 프로그램)
// HttpServlet 상속
// 약속된 service -> 내가 요청한 방법(method) GET, POST에 따라 doGET 또는 doPost를 호출한다
//doGET, ehSMS doPost를 기능에 맞게 오버라이드 한다

// 모델
// 뷰 분리

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet{

	//
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//GET url쿼리스트링 꺼내기
		//myservlet?search=빵
		String search = req.getParameter("search");
		System.out.println(search);
		resp.getWriter().println("GET");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post로 보낸 데이터는 꺼낼 때 한글 인코딩 지정해야 함
		
		request.setCharacterEncoding("utf-8");
		// 사용자 요청 정보 꺼내기
		// 
		String search = request.getParameter("search");
		System.out.println(search);
		
		
		response.getWriter().println("post");
	}
	
}
