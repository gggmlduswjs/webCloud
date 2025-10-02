package day04Prac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		String id="min";
		String pw="1234";
		String name="손민영";
		int point = 5000;
		
		Date birth=null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			birth = sdf.parse("1995-08-12");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(birth);
		

		Acorn acorn = new Acorn(id, pw, name,point,birth);
		
		System.out.println(acorn);

	}

}
