package chapter3;

import java.util.Random;

public class ExEx4_02_04 {

	public static void main(String[] args) {
		int sum = 0;							//4_2
		for (int i = 0; i < 21; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		int dan = 1; 							// 4_3
		while (dan < 9) {
			dan++;
			int gob = 0;
			while (gob < 9) {
				gob++;
				System.out.println(dan + " * " + gob + " = " + dan * gob);
			}
		}

		Random random = new Random();

		for (int i = 1; i < 7 ; i++)			// 4_4
			for (int j = 1; j < 7; j++) {
			if(i + j == 6) {
				System.out.println("("+i+","+j+")");
			}
		}
		
	}

}
