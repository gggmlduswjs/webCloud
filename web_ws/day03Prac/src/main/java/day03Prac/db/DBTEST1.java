package day03Prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTEST1 {
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
		
		while(rs.next()) {	// 가져울 데이터가 있으면 true, 없으면 false
							// rs 객체에서 각 컬럼의 값을 얻어오기
			System.out.println(rs.getString("id"));
			// rs 객체에서 각 컬럼의 값을 얻어오기
			System.out.println(rs.getString(2));
			// rs 객체에서 각 컬럼의 값을 얻어오기
			System.out.println(rs.getString(3));
			// rs 객체에서 각 컬럼의 값을 얻어오기
			System.out.println(rs.getString(4));
			
		}
		
		//7. 자원의 반남(거꾸로 반납)
		
		rs.close();
		st.close();
		con.close();
		
	}

}
