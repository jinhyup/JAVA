package chapter3;

public class ExFor1 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)					 // Hello Java 세 번 출력
			System.out.println("Hello Java");
		
		for (int i = 0; i < 6; i++) {				// 0부터 5까지
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 5; i >= 0; i--) { 			// 5부터 0까지
			System.out.print(i + " ");
		}
		System.out.println();

		int sum = 0; 								// 2부터 11까지 더하기
		for (int i = 2; i < 11; i++) {
			sum += i;
		}
		System.out.println("2부터 11까지의 합 : " + sum);
			

		long m = 1L; 								// 5부터 15까지 곱하기
		for (int i = 5; i < 15; i++) {
			m *= i;
		}	
		System.out.println("5부터 15까지 의 곱 : " + m);

		int sum2 = 0;								// 3부터 4463까지 짝수만 더하기
		for (int i = 3; i < 4463; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("3부터 4463까지 짝수 합 : " +sum2);

		int sum3 = 0;								// 8부터 57까지 2 또는 3의 배수 더하기
		for (int i = 8; i < 57 ; i++)
			if (i % 3 == 0 || i % 2 == 0) {
			sum3 += i;
		}
		System.out.println("8부터 57까지 2 또는 3의 배수 합 : " + sum3);
			
	}

}
