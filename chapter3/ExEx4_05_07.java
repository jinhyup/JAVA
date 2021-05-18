package chapter3;

import java.util.Scanner;

public class ExEx4_05_07 {

	private static int i;

	public static void main(String[] args) {
		int x, y;	
		x=0;// 4_5
		for (x = 0; x < 11; x++) {
			for (y = 0; y < 11; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
		Scanner scanner = new Scanner(System.in);	// 4_6
		System.out.println("시작값을 입력하세요.");
		int a = scanner.nextInt();
		System.out.println("끝값을 입력하세요.");
		int b = scanner.nextInt();
		int max = (b - a) >= 0 ? b : a;
		int min = (b - a) < 0 ? b : a;
		int m = 1;
		for (int i = min; i <= max; i++){
			m *= i;		
		}
		System.out.println("곱은" + max + "입니다.");
		
		int c = 1;									// 4_7
		int sum = 0;
		int msum = 0;
		while (c < 11) {
			sum += c;
			c++;
			msum += sum;
		}
		System.out.println(msum);
	}

}
