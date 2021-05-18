package chapter2;

public class Ex4 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);				//33칸 밀어라..
		System.out.println(y >= 5 || x < 0 && x > 2);	//참, 거짓, 거짓이지만 ||연산자라서 참
		System.out.println(y +=10 - x++);				//y에 10 -2 더하라
		System.out.println(x+=2);						//x+2
		System.out.println(!('A'<= c && c <='Z'));		//false
		System.out.println('C'-c);						//2
		System.out.println('5'-'0');					//5
		System.out.println(c+1); 						//66
		System.out.println(++c); 						//66 B 원래 선언한 형식을 따라감
		System.out.println(c++); 						//67 B?!
		System.out.println(c);							//C
		
		int num = -1;
		String result = num > 0 ? "양수" : (num < 0 )? "음수" : "0";
		System.out.println(result);
		
		int num2 = -1;
		String result2 = num2 == 0 ? "0" : (num2 > 0 )? "양수" : "음수";
		System.out.println(result2);
		
		
		int apples = 121; 	//사과의 개수
		int bucket = 10; 	//바구니 크기
		int numOfBucket1 = apples / bucket + (apples % bucket > 0 ? 1 : 0); //선생님 정답
		int numOfBucket = apples % bucket > 0 ? (apples/bucket +1) : (apples/bucket); //모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
		System.out.println("필요한 바구니의 수 : "+numOfBucket1);
		
		int num1 = 456;
		int result1 = (int)(num1*0.01)*100;
		
		System.out.println(result1);
	}

}
