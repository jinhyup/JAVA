package chapter3;

import java.util.Random;

public class ExRandom {

	public static void main(String[] args) {
		// random한 수 구하기 (feat. 핫한 방식)
		// 1.공식 : (int)(Math.random() * 마지막수 + 처음수)
//		System.out.println((int)(Math.random() * 10 + 1));
		// 2. Random이라는 클래스를 이용하는 방법
		Random rd = new Random();
	//  랜덤이라는 변수의 선언 + 변수 = 초기화;
		int num = rd.nextInt(10) + 1; // 1~10까지
		System.out.println(num);
		double num2 = rd.nextDouble();
		System.out.println(num2);
	}

}
