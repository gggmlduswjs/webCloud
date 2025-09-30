package day02Prac;

public class Book_04 {
	private String title;
	private String author;
	private int price;

	
	//메서드를 통해서 데이터 다루기
	
	//1) 값을 넣는 메서드 ( 특별한 메서드 - 생성자 -> 객체가 생성될 때 단한번 호출, 클래스 이름 동일, 반환타입 명시)
	//생성자
	public Book_04() {
		
	}
	
	public Book_04(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	//2) 값 꺼내기 
	// toString()
	@Override
	public String toString() {
		return "Book_04 [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	
	//getter 만들기 (개별값 빼내기 위해)
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}
	
	
}
