package day04Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {
	

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
		AcornDAO dao=new AcornDAO();
//		Connection con= dao.dbcon();
//		System.out.println(con);
		
	
		
		
		
//		dao.inserMember(new Acorn("test", "1002", "길동" ,1000));
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
				 
				 Acorn acorn = new Acorn(id, pw, name, point);
				 list.add(acorn); 
			 }
			 
			 rs.close();
			 pst.close();
			 con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return list;
		
	}
	
	// 등록하기
	public void inserMember(Acorn acorn) {
		Connection con= dbcon();
		//Sql 작성
		String sql="insert into acorntbl (id,pw,name,point) values(?,?,?,?)";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			// 물음표로 되어 있는 값 세팅하기 주의사항!! 왼쪽부터 순서가 정해짐 왼쪽부터 1번
			pst.setString(1, acorn.getId());
			pst.setString(2, acorn.getPw());
			pst.setString(3, acorn.getName());
			pst.setInt(4, acorn.getPoint());
			
			// 등록해주세요
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//실행하기(반영하기)
		
		//
	}


}
