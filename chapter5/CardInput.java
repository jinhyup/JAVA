package chapter5;

public class CardInput {

	public static void main(String[] args) {
		System.out.println(Card.width); //폭출력
		System.out.println(Card.height); //너비 출력
		Card cd1 = new Card();			//지역변수
		cd1.name = "Daniel";
		cd1.number = 19961210;
		Card cd2 = new Card();
		
		cd2.name = "소년탐정 김전일";
		cd2.number = 19950922;
		
		System.out.print("1번 카드 이름은 " + cd1.name + "이고 " + "생일은 " + cd1.number + "이고 "); 
		System.out.println("폭은 " + Card.width + "이고 " + "너비는 " + Card.height + "입니다.");
		System.out.print("2번 카드 이름은 " + cd2.name + "이고 " + "생일은 " + cd2.number + "이고 ");
		System.out.println("폭은 " + Card.width + "이고 " + "너비는 " + Card.height + "입니다.");
	}

}
