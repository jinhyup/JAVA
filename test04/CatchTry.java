package test04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchTry {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("어떤 수를 나누시겠습니까?>> ");
				int a = sc.nextInt();
				System.out.println("어떤 수로 나누시겠습니까?>> ");
				int b = sc.nextInt();
				double division = a / (b + 0.0);
				System.out.println(a + "/" + b + " = " + division);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
	}
}
