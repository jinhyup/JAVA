package chapter3;

import java.util.Scanner;

public class ExIf {							//if함수 기초

	public static void main(String[] args) {

		boolean power = true;
		if (power) {
			System.out.println("켜져있습니다.");
		}
	///////////////2의배수구분하기//////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int input;
		input = sc.nextInt();

		if (input % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2의 배수가 아닙니다.");
		}
	//////////////////성적처리/////////////////////
		int score;
		score = (int) (Math.random() * 100 + 1);

		System.out.println("score : " + score);
	
		if (score >= 90) { 								// 필터링을 한다고도 많이 함
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	///////////////////if중첩////////////////////
		int score1 = 96;
		if (score1 >= 90) {
			System.out.print("A");
			if (score1 >= 95) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}

	}

}
