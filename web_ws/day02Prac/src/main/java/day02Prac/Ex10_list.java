package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cute/img/random")
public class Ex10_list extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        // ArrayList에 이미지 파일명 저장
        ArrayList<String> images = new ArrayList<>();
        images.add("1.jpg");
        images.add("2.jpg");
        images.add("3.jpg");
        images.add("4.jpg");
        
        Random random = new Random();
        int index = random.nextInt(images.size());  
        
        String selectedImage = images.get(index); 

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src=\"/day02Prac/" + selectedImage + "\">");
        out.println("</body>");
        out.println("</html>");
    }
}