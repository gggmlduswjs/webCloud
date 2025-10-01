package day03Prac;

import java.util.Random;

public class EX08Service {

	
	//기능
	//매서드
	//랜덤한 화이팅 메시지 반환하기
	
	public String getRandomMessage() {
		
		
		String [] list = new String[] {
				"🚀 오늘도 멋지게! 작은 한 걸음이 큰 변화를 만든다!",
				"🌈 힘들 땐 잠깐 쉬어가도 괜찮아, 결국 끝까지 가는 게 승리야!",
				"💪 네가 해온 모든 노력은 절대 배신하지 않아. 파이팅!",
				"🌟 오늘의 너는 어제보다 더 강해졌다! 자신감을 가지고 나아가자!",
				"🔥 할 수 있다! 아니, 이미 해내고 있다!"
		};
		
		// random Index 만드는 것
		Random r = new Random();
		
		int randomIndex=r.nextInt(list.length); // 5, 0~4 중에서 임의의 수 제공
		
		return list[randomIndex];
	}
	
	public static void main(String[] args) {
		EX08Service s= new EX08Service();
		String result = s.getRandomMessage();
		System.out.println(result);
	}
	
}
