package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//이미지요청 이미지제공
//서블릿 mvc로 만들기
//modetl
//VIEW
//contrroller
//GET, POST
//url 큐트이미지로 들ㅇ어오면 클래스 시작
@WebServlet("/cuteimg")
public class ExpraMVC extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ExpraService service = new ExpraService();

		// 1) 모델 호출 
		String img = service.cuteimg();

		// 2) request 저장소 저장
		request.setAttribute("img", img);

		request.getRequestDispatcher("/WEB-INF/views/ExpraView.jsp").forward(request, response);

	}

}
