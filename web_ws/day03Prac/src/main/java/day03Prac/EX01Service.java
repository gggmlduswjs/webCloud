package day03Prac;


// 두 수에 사칙연산 결과 제공하기
// 매서드로 만들기
public class EX01Service {
	
//	public String[] getResult2() {
//		String[] list = new String[4];
//		
//		list[0] = 10+3+""; // 숫자를 문자열로 만들기
//		list[1] = String.valueOf(10-3); // 숫자를 문자열로 만들기
//		list[2] = String.valueOf(10*3);
//		list[3] = String.valueOf(10/(double)3);
//		
//		return list;
//	}
	
	public String[] getResult(int su1, int su2) {
		String[] list = new String[4];
		
		list[0] = su1+su2+""; // 숫자를 문자열로 만들기
		list[1] = String.valueOf(su1-su2); // 숫자를 문자열로 만들기
		list[2] = String.valueOf(su1*su2);
		list[3] = String.valueOf(su1/(double)su2);
		
		return list;
	}
	
	
	public static void main(String[] args) {
		EX01Service service = new EX01Service();
		String[] list=service.getResult(20,5);
		
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}
	
}
