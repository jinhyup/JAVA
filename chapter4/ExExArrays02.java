package chapter4;

import java.util.Arrays;
import java.util.Random;

public class ExExArrays02 {

	public static void main(String[] args) {
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2790;
//		for (int i = 0; i < coinUnit.length; i++) {
//		System.out.println(coinUnit[i] + "원 " + money/coinUnit[i] + "개");
//		money = money % coinUnit[i];
//		}
		
		
		
		
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
		int[] ball3 = new int[3];
		Random random = new Random();
		for (int j = 0; j < ballArr.length; j++) {
			int ranNum = random.nextInt(9);
			int tmp = 0;
			tmp = ballArr[j];
			ballArr[j]= ballArr[ranNum];
			ballArr[ranNum] = tmp;
		}
			System.out.println(Arrays.toString(ballArr));
			for (int k = 0; k < ball3.length; k++) {
				ball3[k] = ballArr[k];
				System.out.println(ball3[k]);	
		}
		
		
		
		
		
//		int[] coinUnit = {500, 100, 50, 10};
//		int a = 2790;
//		int money = 2790;
//		for (int i = 0; i < coinUnit.length; i++) {
//			money = a/ coinUnit[i];
//			a = a % coinUnit[i];
//			System.out.println(coinUnit[i] + "원 : " + money + "개");
//		}

	}

}
