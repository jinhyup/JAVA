package chapter3;

import java.util.Scanner;

public class ExEx4_08_09 {

	public static void main(String[] args) {
		int i = 1;						// 4_8
		int sum = 0;
		
		while (true) {
			sum += (i % 2 ==0) ? -i : i;
			if (sum >= 100) {
				break;	
			}
			i++;
		}
//		while (sum < 100) {				//내답
//			if (i % 2 == 1) {
//				sum += i;
//				i++;
//			} else {
//				sum -= i;
//				i++;
//			} 
//		}  i--;
		System.out.println(i);
		
		Scanner scanner = new Scanner(System.in);					//4_9
		System.out.println("각 자리 합을 더할 수를 입력하세요.");
		int b = scanner.nextInt();
		int sum1 = 0;
		while (b != 0) {
			sum1 += b % 10;
			b = b / 10;
		}
		while (true) {
			sum1 += b % 10;
			b = b / 10;
			if (b == 0) {
				break;
			}
		}
		System.out.println(" 각 자리 수 합은 " + sum1 + "입니다.");

		int a1 = 1;							// 4_10
		int a2 = 1;
		int a3 = 0;
		int i1;
		for (i1 = 2; i1 < 10; i1++) {		
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
		}
		System.out.println("피보나치 수열" + i1 + "번째 수는 " + a3 + "입니다.");
		
		 
	}

}
