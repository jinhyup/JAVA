package chapter2;

public class Ex2 {

	public static void main(String[] args) {
	int a = 1; //0000 0001
	int b = 3; //0000 0011
	System.out.println(a|b); // or 연산 	이진수11->십진수3출력
	System.out.println(a&b); // and연산		이진수01->십진수1출력
	System.out.println(a^b); // xor연산		이진수10->십진수2출력
	
	
//  & 하나 일 때는 둘 다 연산 실시
//	&& 두 개일 때는 하나의 결과만 사용하기도 함
	
	//Ex2_8
	boolean b1 = true;
	boolean b2 = false;
	System.out.println(b1 && b2);
	
	int in01 = 10;
	boolean re1 = in01 % 2 ==0;
	boolean re2 = in01 % 4 ==0;
	System.out.println(re1 || re2);
	System.out.println();

// 반올림
	
	float pi = 3.141592F;
	pi *=1000;
	System.out.println(pi); 		// 3141.592
	pi +=0.5;
	System.out.println(pi); 		// 3142.092
	pi = (int)pi;
	System.out.println(pi);			// 3142.0  한 번 선언한 타입을 못 바꾸기때문에...
	//그렇다면 pi를 정수로 선언하려면..? 
	//	1) 다른 변수를 가져오거나 
	//	2)print되는 값을 int로 선언
	
	int a1 = (int)pi;
	System.out.println(a1);
	pi = pi/1000F;
	System.out.println(pi);			// 3.142
	
	
	
	//Qu2_13
	
	}

}
