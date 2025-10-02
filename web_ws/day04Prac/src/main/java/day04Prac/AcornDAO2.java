package day04Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO2 {
	

	//
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";  // system
	String password="tiger"; //1234
	
	//db연결하고 연결된 커넥션 객체를 반환하는 매서드
	public Connection  dbcon() {
		
		Connection con =null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if(con != null) System.out.println("dbok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
		
	}
	
	public static void main(String[] args) {
		AcornDAO2 dao=new AcornDAO2();
//		Connection con= dao.dbcon();
//		System.out.println(con);
		
		ArrayList<Acorn> list = dao.selectAll();
		System.out.println(list);
	}
	
	//전체 조회하기 매서드(sql스럽게 작성)
	
	public  ArrayList<Acorn>  selectAll(){
		 Connection con  =dbcon();		  // preparedStatement 객체 , sql작성, 실행, ResultSet 실행결과 가져오기  ArrayList<Acorn>
		 String sql="select * from  acorntbl";
		 
		 ArrayList<Acorn> list = new ArrayList<>();
		 
		 try {
			 PreparedStatement  pst  = con.prepareStatement(sql);
			 ResultSet rs=  pst.executeQuery();
			 
			 while( rs.next()) {
			//	 System.out.println( rs.getString(1));
				 String id  = rs.getString(1);
				 String pw  = rs.getString(2);
				 String name  = rs.getString(3);
				 int point  = rs.getInt(4);
				 java.util.Date birth = rs.getDate(5);	//자바 날짜 java.util.Date 데이터베이스 날짜 java.sql.Date
				 
				 Acorn acorn = new Acorn(id, pw, name, point,birth);
				 list.add(acorn); 
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return list;
		
	}


}
