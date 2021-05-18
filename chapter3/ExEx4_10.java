package chapter3;

public class ExEx4_10 {

	public static void main(String[] args) {
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		//반복문과 charAt(int i)를 이용해서 문자열의 문자를
		//하나씩 읽어서 검사한다.
//		for (int i = 0; i < value.length(); i++) {				//while 이용
//			int a = value.charAt(i) - '0';
//			while (isNumber = false) {
//				if (a >= 0 && a < 10) {
//					isNumber = true;
//				} else {
//					isNumber = false;
//				}
//			}
//
//		}
//		
//		if (isNumber) {
//			System.out.println(value + "는 숫자입니다.");
//		} else {
//			System.out.println(value + "는 숫자가 아닙니다.");
//		}
		
		for (int i = 0; i < value.length(); i++) {				//break 이용
			while (true) {
				int a = value.charAt(i) -'0';
				if (!(a >= '0' && a <= '9')) {
					isNumber = false;
					break;
				}
			}
			
//			for (int i = 0; i < value.length(); i++) {			//break 이용
//			int a = value.charAt(i) - '0';
//			while (isNumber = false) {
//			if (ch >= '0' && ch <= '9') {
//				isNumber = true;
//				} else {
//					isNumber = false;
//					break;
//				}

		}
		
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

	}

}
