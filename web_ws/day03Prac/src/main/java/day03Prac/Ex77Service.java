package day03Prac;


public class Ex77Service{
	
	public boolean login(String id, String pw){
		if(id.equals("admin") && pw.equals("0000")) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
