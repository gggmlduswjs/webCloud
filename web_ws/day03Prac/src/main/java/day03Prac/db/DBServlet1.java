package day03Prac.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 에이콘 학생정보 조회하기

@WebServlet("/acornList")
public class DBServlet1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out  = resp.getWriter();
		
		
		//
		
		//모델
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";  // system
		String password="tiger"; //1234
		
		
		
		try {
			// 1. 드라이버 로드 (라이브러리 로드)
			Class.forName(driver);
			//2. 커넥션 열기
			Connection con=DriverManager.getConnection(url,user,password);
			
			// 3.statement 객체 얻기
			Statement st =con.createStatement();
			
			//4. sql 작성
			String sql = "selec * from acorntbl";
			
			//5. sql 실행하고 결과 얻어오기
			ResultSet rs = st.executeQuery(sql);
			
			//6. 반복문으로 데이터 응답하기 
			
			while(rs.next()) {
				String id= rs.getString(1);
				String pw=rs.getString(2);
				String name=rs.getString(3);
				int point =rs.getInt(4);
				
				out.println(id+pw+name+point);
				
				
				//
				
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
