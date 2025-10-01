package day03Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 원하는 수만큼 별을 출력하기

//서블릿 -> MVC로 마늗ㄹ기
//Model
//View
//Controller
//GET, POST ( GET 요청)

@WebServlet("/star/mvc")
public class EX05MVC extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String su1_= request.getParameter("su1");
		
		
		if(su1_ == null)
			return;
		
		int su1= Integer.parseInt(su1_);
		
		System.out.println(su1);
		
		// 두수의 대한 별찍기 만들기 - 모델(별도의 자바 파일)
		EX05Service service=new EX05Service();
		String[] result=service.getResult(su1);
		
		// 데이터 저장하기(request 저장소에)
		request.setAttribute("data", result);
		
		// 뷰(jsp)로 흐름 넘기기 forward 하기
		
		request.getRequestDispatcher("/WEB-INF/views/EX05View.jsp").forward(request, response);
		
	
	    
	}

}
