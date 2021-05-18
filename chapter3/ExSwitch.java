package chapter3;

import java.util.Random;
import java.util.Scanner;

public class ExSwitch {					// Switch는 조건식 결과값과 case의 값이 같아야 실행 됨
										// ★Switch 제약 조건 : 조건식 값은 정수, 문자, case문 값은 정수, 문자만
	public static void main(String[] args) {
		/////////////////////////////////////////////
		System.out.println("현재 월을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int mon = scanner.nextInt();
		switch (mon) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울 입니다.");
			break;
		default:
			System.out.println("잘못된 월을 입력하셨습니다. ");
		}
		//////////////////////////////////////////////
		Random rd = new Random();
		int random = rd.nextInt(5) + 1;
		switch (random) {
		case 1:
			System.out.println("32평 아파트 당첨");
			break;
		case 2:
			System.out.println("자동차 당첨");
			break;
		case 3:
			System.out.println("노트북 당첨");
			break;
		case 4:
			System.out.println("자전거 당첨");
			break;
		default:
			System.out.println("다음 기회에 ");
		}
		////////////////////////////////////////////////
		int score = rd.nextInt(101);
		switch ( score / 10) {
		case (10): case (9):
			System.out.println("A");
			break;
		case (8):
			System.out.println("B");
			break;
		case (7):
			System.out.println("C");
			break;
		case (6):
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
