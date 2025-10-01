package day03Prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBTEST2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";  // system
		String password="tiger"; //1234
		
		// 1. 드라이버로드 ( 객체생성)
		
		Class.forName(driver);
		// 2. 데이터베이스 연결
		
		Connection con=DriverManager.getConnection(url,user,password);
		
		if(con !=null) System.out.println("db ok");
		
		// 3. 문장 얻어오기
		Statement st=con.createStatement();
		
		// 4. 쿼리 작성
		String sql="select*from acorntbl";
		
		// 5. 쿼리 실행 후 결과 얻어오기
		ResultSet rs=st.executeQuery(sql);
		
		
		// 6. 쿼리결과 출력하기 (while 반복문 사용)
		
		// Acorn 학생 정보를 담을 수 있는 Acorn 클래스 작성 
		 ArrayList<Acorn> list = new ArrayList<>();
		
		while(rs.next()) {
			String id=rs.getString(1);
			String pw=rs.getString(2);
			String name = rs.getString(3);
			int point = rs.getInt(4);
			
			//Acorn 객체 만들기
			Acorn acorn = new Acorn(id,pw,name,point);
			list.add(acorn);
		}
		
		
		//7. 자원의 반남(거꾸로 반납)
		
		rs.close();
		st.close();
		con.close();
		
		// 결과를 출력
		for(Acorn student : list) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPw());
			System.out.println(student.getPoint());
		}
		
	}

}
