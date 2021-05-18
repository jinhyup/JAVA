package chapter2;

import java.util.Random;

public class Ex3 {



	private static int x;

	public static void main(String[] args) {
	//random 출력
	Random random = new Random();
	int ran = random.nextInt(100); //0이상~100미만
	int ran2 = random.nextInt(375 - 44) + 44; //44이상~375미만
	
	//상황연산자
	
	double result = x > 0 ? 0 : 0.5;
	System.out.println(result);
	
	
	Random random1 = new Random();
	int menu = random1.nextInt(2);
	if(menu == 1) {
		System.out.println("토마토도시락");
	}
	else{
		System.out.println("칼국수");
	}
	}

}
