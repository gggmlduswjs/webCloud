package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet => 요청에 대한 controller

@WebServlet("/helloMVC")
public class HelloMVC extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 1. 사용자한테 넘어온 데이터 꺼내기
		
		// 2. 응답데이터 만들기(응답 데이터만 만들기) => 분리합니다 (MODEL)
		
		String str="hello mvc ^^ 전희연";
		
		// 3. 최종 웹형식으로 응답하기 => 분리합니다(jsp) : 뷰로 사용되는 jsp는 단독으로 실행되지 않도록 해야 한다
								// => webapp에 위치하면 단독으로 실행됨
								// => 외부에서 요청할 수 없는 영역 webapps -> WEB-INF -> views라는 폴더를 만들고 아래에 둠
								// => view로 사용하는 jsp가 있는 위치 !!
		
		// 4. MVC패턴에서 서블릿과 jsp가 함께 사용하는 공간(저장소)로 request라는 객체를 사용함
		// request 객체는 유효범위 하나의 요청이 응답되기 전까지 유효함
		// request 저장소에 데이터(모델) 저장하기(심기)
		// 심어놓고 
		request.setAttribute("data",str);
		
			
		
		// 5. 요청에 대한 처리 흐름을 jsp로 보내기 (forward)
		request.getRequestDispatcher("WEB-INF/views/helloMVCView.jsp").forward(request,response);
		
	}

}
