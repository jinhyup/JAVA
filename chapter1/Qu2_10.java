package chapter1;

public class Qu2_10 {

	public static void main(String[] args) {
	
	//Qu2_11
	char ch01 = 'a';
	boolean re03 = ch01 >= 'A' && ch01 <= 'Z';
	boolean re04 = ch01 >= 'a' && ch01 <= 'z';
	boolean re05 = (ch01 >= 'A' && ch01 <= 'Z') ||(ch01 >='a' && ch01<='z'); 
	//A~Z 아스키코드 65~90, a~z 는 97-122 이므로 따로 지정
	System.out.println(re03);
	System.out.println(re04);
	System.out.println(re05);
	
	//Qu2_12
	char x = 'a';
	String re06 = (x >= 'A' && x <='Z' ? "대문자" : x >= 'a' && x <='z' ? "소문자" : "영문자 아님");
	System.out.println(re06);
	
	//Ex2_10
	int b = 6;
	b += 7; //저장된 b값에 7을 더해 b에 저장
	char c ='A';
	int re07 = c +4; //c+4가 int형이므로 re05가 타입도 int여야 한다.
	System.out.println(re07);
	c += 3; //복합연산자의 경우 원래 타입을 유지한다.
	System.out.println(c); //D가 출력
	
	//증감연산자
	int a = 0;
	a++;//a에서 1증가
	a--;//a에서 1감소
	System.out.println(a);
	
	//연습 a++, ++a 차이
	int a1 = 0;
	
	int b1 = 0;
	
	int c1 = a1++ + b1++; //a1=1, b1=1, c1=0,  a1과 b1은 값이 커지지만 
						  //a1, b1을 미리 불러왔기에 c1은 0
	int d1 = ++a1 + ++b1; //a1=2, b1=2, d1=4,  a1과 b1은 이미 위 식에서 값을 더해준 것에 1씩 더함
	                      //따라서 d1은 2+2 =4
	System.out.println(c1);
	System.out.println(d1);
	}

}
