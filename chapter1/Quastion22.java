package chapter1;

public class Quastion22 {

	public static void main(String[] args) {
//	1. 정수(integer)를 저장할 수 있는 변수 value를 선언하여라.
	int value;
//	2. 변수 value를 30의 값으로 초기화 하여라.
	value = 30;
//	3. 변수 value의 값을 100으로 변경하여라.
	value = 100;
//	4. 정수(integer)를 저장할 수 있는 변수 value2를 선언하여라.
//	7의 값으로 초기화 하여라.
	final int value2 = 7;
	System.out.println(value2);
//	char는 문자 하나만 지정 가능. 두 개하면 에러
	/*
	 * char abc = 'a'; 컴파일 됨
	 * char abc = 'ab'; 컴파일 안 됨
	 */
//  문자열
	String lang = "Java";
	lang = "test1\'\r";
	System.out.print(lang);
	System.out.print(lang);
	System.out.print(lang);
	

	}

}
