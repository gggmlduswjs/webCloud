package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 두수의 사칙연산 응답하기
// 서블릿 => MVC만들기
// 서블릿 : 요청, 흐름제어
// 뷰 : 응답뷰 담당
// 모델 : 데이터 담당
// 사용자정보 /calcMVC?su1=10&su2=3

@WebServlet("/calcMVC")
public class EX01MVC extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 요청 정보 가져오기
		String su1_= request.getParameter("su1");
		String su2_= request.getParameter("su2");
		
		// 사용자가 입력하지 않으면 그냥 끝낼 수 있도록 하기
		if(su1_ == null)
			return;
		
		int su1= Integer.parseInt(su1_);
		int su2= Integer.parseInt(su2_);
		
		System.out.println(su1);
		
		// 두수의 대한 사칙연산 만들기 - 모델(별도의 자바 파일)
		EX01Service service=new EX01Service();
		String[] result=service.getResult(su1, su2);
		
		// 데이터 저장하기(request 저장소에)
		request.setAttribute("data", result);
		
		// 뷰(jsp)로 흐름 넘기기 forward 하기
		
		request.getRequestDispatcher("/WEB-INF/views/EX01View.jsp").forward(request, response);
	}
}
