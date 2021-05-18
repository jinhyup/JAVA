package chapter2;

public class Ex1 {

	public static void main(String[] args) {
	//Qu2_10									true or false
		
	float f01 = 0.1f;
	float f02 = 10.0f;
	double do01 = 0.1;
	double do02 = 10.0;
	String str1 = "화이팅";
	
	//f01과 do01의 값은 같은가?
	boolean re01 = f01 == (float)do01;			//같냐고 물어볼 땐 ==
	System.out.println(re01);
	
	//f02와 do02의 값이 같은가?
	boolean re02 = f02 == do02;
	System.out.println(re02);
	
	//str1값이 "화이팅과 값이 같은가?
	boolean re03 = str1 == "화이팅";
	System.out.println(re03);
	
	int number = 30;
	char ch = 'C';
	int result = number++ +3 + ++ch + ++number;
	
	System.out.println("number :" + number);
	System.out.println("ch : "+ch);
	System.out.println("result :" + result);
	
	//ex2_5												비트연산자
	byte b = 10; //b를 바이트 선언 &10으로 초기화
	byte b2 = (byte)~b; //비트 전환
	System.out.println("b2의 값 : "+b2);
	
	}

}
