package chapter3;

import java.util.Scanner;

public class ExEx4_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("11부터 19사이 수를 입력하세요 : ");
		int x = scanner.nextInt(); 								// (1)
		if (x > 10 && x < 20) {
			System.out.println(true);
		}

		char ch1 = '	'; // (2)
		if (ch1 == ' ') {
			System.out.println(true);
		}

		System.out.println("x또는 X를 입력하세요 : ");
		char ch2 = scanner.next().charAt(0); 					// (3)
		if (ch2 == 'x' || ch2 == 'X') {
			System.out.println(true);
		}

		System.out.println("0부터 9사이 수를 입력하세요 : "); 	// (4)
		char ch3 = scanner.next().charAt(0);
		if (ch3 > '0' && ch3 < '9') {
			System.out.println(true);
		}
	
		System.out.println("영문자를 입력하세요 : ");			// (5)
		char ch4 = scanner.next().charAt(0);
		if ((ch4 >= 'a' && ch4 <= 'z') || (ch4 >='A' && ch4 <= 'Z')) {
			System.out.println(true);
		}
		
		boolean powerOn = false;								//(6)
		if (powerOn != true) {
			System.out.println(true);
		}
		System.out.println("yes or no를 입력하세요 :");			//(7)
		String str = scanner.next();
		System.out.println(str.equals("yes"));

	}

}
