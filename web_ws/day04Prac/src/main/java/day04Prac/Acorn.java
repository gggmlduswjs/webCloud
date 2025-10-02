package day04Prac;

import java.util.Date;

public class Acorn {
	
	String id;
	String pw;
	String name;
	int point;
	Date birth;
	
	public Acorn(String id, String pw, String name, int point, Date birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
		this.birth = birth;
	}
	
	public Acorn(String id, String pw, String name, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
		
	}
	public Acorn() {
		
	}
	
	
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", name=" + name + ", point=" + point + ", birth=" + birth + "]";
	}



	public String getId() {
		return id;
	}



	public String getPw() {
		return pw;
	}



	public String getName() {
		return name;
	}



	public int getPoint() {
		return point;
	}



	public Date getBirth() {
		return birth;
	}
	
	//생성자
	
	
	//toString 
	
	//getter
	
	//
}
