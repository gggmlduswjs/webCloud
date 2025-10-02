package day04Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//에이콘 학생 등록 요청 처리하기 (등록하고 축하 응답)
//m : 모델
//v : 뷰
//c : 서블릿( get, post)


// 등록이라는 요청은 화면주기, 실제 등록하기

// 등록화면 주기	(GET)
// 등록해주기( 서버에 등록하고 축하 응답하기) - POST

@WebServlet("/reg")
public class AcornReg extends HttpServlet{
	// 빈화면 응답하기
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	// 실제 등록해주기
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		// 서버에서 데이터 꺼내기
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		int point=Integer.parseInt(request.getParameter("point"));
//		System.out.println(id);
		Acorn acorn=new Acorn(id,pw, name,point);
		System.out.println(acorn);
		
		
		//서비스, dao(데이터 베이스 등록)
		//서비스 - 등록하기
		// dao - 등록하기
		AcornService service = new AcornService();
		service.registerMember(acorn);
		
		
		// 모델(jsp에서 사용할 데이터) x
		// 모델 request 저장 필요없음
		// 응답(회원가입 축하 뷰 응답)
		
		
		request.getRequestDispatcher("/WEB-INF/views/regok/jsp").forward(request,response);
		
				
		
	}
}
