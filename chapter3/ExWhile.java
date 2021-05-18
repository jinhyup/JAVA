package chapter3;

import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {

		int count = 1;					//1부터 5까지 출력
		while (count < 11) {
			System.out.println(count);
			count++;
		}
		////////////////////////////
		int k = 1;						//1부터 100까지 합 구하기
		int sum = 0 ;
		while (k < 101) {
			sum = sum + k;
			k++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		///////////////////////////////
		int a = 1;						//1부터 더해서 200 초과 되는 변수 지정 & 값의 합 구하기
		int sum1 = 0;
		while (sum1 <= 200) {
			sum1 = sum1 + a;
			a++;
		}
		a = a -1;
		System.out.println("200이 넘는 최초의 값 : " + a);
		System.out.println("200이 넘는 값들의 합 : " + sum1);
		////////////////////////////////
		String str = "184520";			// 문자열의 합계 구하기
		int sum2 = 0;
		for (int count1 = 0; count1 < str.length(); count1++) {
			sum2 += str.charAt(count1)-'0';
		}
		System.out.println("184520의 합계 : " + sum2);
		///////////////////////////////
		String num; 					// 각 자리 숫자 합계 구하기(콘솔창 입력버젼)
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세용 : ");
		num = scanner.next();
		int sum3 = 0;
		for (int count2 = 0; count2 < num.length(); count2++) {
			sum3 += num.charAt(count2) - '0';
		}			
		System.out.println("각 자리수 합은" + sum3 + "입니다.");
		//////////////////////////////

		int num5 = 0; // 입력된 숫자가 저장될 변수를 초기화 한다.
		int sum5 = 0; // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화 한다.

		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		num5 = sc.nextInt();

		while (num5 != 0) {
			// num5을 10으로 나눈 나머지를 sum5에 더한다.
			sum5 += num5 % 10;
			// num5을 10으로 나눈 값을 다시 num5에 저장한다.
			num5 /= 10;
		}
		System.out.println("각 자리수의 합은 " + sum5 + "입니다.");
		System.out.println("프로그램을 종료합니다.");
		//////////////////
	}

}
