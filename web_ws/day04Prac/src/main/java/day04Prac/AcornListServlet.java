package day04Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 에이콘 학생정보 요청에 대한 저리(응답하기)

//m	: 에이콘 학생정보 리스트 - 디비(service, dao)
//v : jsp
//c : servlet


@WebServlet("/list")
public class AcornListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 사용자 정보 x
		
		// 모델
		// service , dao
		AcornService service = new AcornService();
		ArrayList<Acorn> list = service.getMemberList();
		
		// 모델 저장하기
		request.setAttribute("list", list); //"list" => 키

		// 뷰로 포워드시키기
		request.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(request,response);
	}
	
}
