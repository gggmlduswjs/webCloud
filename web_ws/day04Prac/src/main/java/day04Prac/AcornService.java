package day04Prac;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao=new AcornDAO();
	
	
	// 에이콘 학생 정보 반환하기 (매서드)
	
	public ArrayList<Acorn> getMemberList() {
		//
		ArrayList<Acorn> list=dao.selectAll();
		
		return list;
		
	}
	
	//에이콘 학생 등록하기(매서드)
public void  registerMember( Acorn acorn) {
		
		dao.inserMember(acorn);
		
	}
}
