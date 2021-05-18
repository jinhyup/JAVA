package chapter2;

public class Ex5555 {

	public static void main(String[] args) {
	byte b = 20;
	byte c = (byte)(10 + b); // +연산은 정수 단위에서 기본 int니까 byte로 강제캐스팅 해야함
	char ch = 'A';
	ch = (char)(ch + 34);
	float f = 3/2F ;
	long l = 3000 * 3000 * 3000L;
	float f2 = 0.1f;
	double d = 0.1f;		//precision : 정밀도
	boolean result = d ==f2;
	
	System.out.println("c="+c);
	System.out.println("Ch="+ch);
	System.out.println("f="+f);
	System.out.println("l="+l);
	System.out.println("result="+result);
	
	int num = 24;
	int result1  = ((num/10 + 1) * 10)%num; 
	System.out.println("result : " + result1);
	
	int fahrenheit = 100;
	float formula = 5/9F * (fahrenheit - 32);
	float celcius = (int)(formula*100 + 0.5)/100F;
	System.out.println("Fahrenheit : "+fahrenheit);
	System.out.println("Celcius : "+celcius);
	

	
	}

}
