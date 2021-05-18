package chapter5;

import java.util.Scanner;

public class MethodTest {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int firstNum = scanner.nextInt();
		String cal = scanner.next();
		int secondNum = scanner.nextInt();

		
		
		MethodTest2 method = new MethodTest2();
		
		switch (cal) {
		case "+" :
			System.out.println("값은 " + method.add(firstNum, secondNum));
			break;
		case "-" :
			System.out.println("값은 " + method.substract(firstNum, secondNum));
			break;
		case "*" :
			System.out.println("값은 " + method.multiply(firstNum, secondNum));
			break;
		case "/" :
			System.out.println("값은 " + method.divide(firstNum, secondNum));
			break;
		default :
			break;			
		}
		
		//if보다 switch가 깔끔함
//		if (cal.equals("+")) {
//			System.out.println("값은 " + method.add(firstNum, secondNum));
//		} else if (cal.equals("-")) {
//			System.out.println("값은 " + method.substract(firstNum, secondNum));
//		} else if (cal.equals("*")) {
//			System.out.println("값은 " + method.multiply(firstNum, secondNum));
//		} else if (cal.equals("/")) {
//			System.out.println("값은 " + method.divide(firstNum, secondNum));
//		}
		
	}	
}
