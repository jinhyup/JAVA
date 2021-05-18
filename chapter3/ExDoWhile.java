package chapter3;

import java.util.Random;
import java.util.Scanner;

public class ExDoWhile {

	public static void main(String[] args) {
	/*
	 * do-while 기본 형식
	 * do{
	 * 			//한 번 무조건 실행
	 * 			//while 조건이 맞으면 다시 또 do를 실행
	 * } while (조건식);
	 */
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int answer = random.nextInt(100) + 1; // 1~100사이의 임의의 정수를 저장할 변수
		int input = 0; // 사용자로부터 입력받은 값을 저장할 변수
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요. : ");
			input = scanner.nextInt();

			if (input < answer) {
				System.out.println("더 큰 수를 입력해주세요.");
			} else if (input > answer) {
				System.out.println("더 작은 수를 입력해주세요.");
			}
		} while (input != answer);

		System.out.println("정답입니다.");

	}

}
