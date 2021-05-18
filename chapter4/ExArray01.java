package chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import chapter5.Car;

public class ExArray01 {

	public static void main(String[] args) {
//		int score[] = new int[5];							//score에 입력하는 방법
//		for (int i = 0; i < 6; i++) {
//		score[i] = 10*i;
//		System.out.println("score[" + i + "] : "+score[i]);
//		}
		
		int[] score = {0, 10, 20, 30, 40};		//score에 입력하는 방법 2
		
		int[] arr = new int[5];			// 길이가 5인 array (new int 생략가능)
		int tmp = arr.length;			// arr array의 길이 5를 tmp에 저장
		
		for (int i = 0; i < 5; i++) {	//array.length를 넘어가는 경우 바운드가 넘어간다고 경고가 뜸.
			System.out.println(Array.get(score, i));
		}
		
		for (int j = 0; j < arr.length; j++) { // array.length를 넘어가지 않는 문법
			System.out.print(score[j] + " ");
		}
		System.out.println();

		
		//배열의 요소 합계 및 평균
		int sum = 0;		//총점 저장 변수
		
		int[] score1 = {40, 80, 73, 84, 92};
		for (int i = 0; i < arr.length; i++) {
			sum += score1[i];
		}
		float average = 0f;	//평균 저장 변수
		average =(float) sum/score.length;	//계산결과를 float로 얻기 위해서 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		//연습
		int[] score2 = new int[7];
		Random random = new Random();
		double sum1 = 0d;
		for (int i = 0; i < 7; i++) {
			score2[i] = random.nextInt(101);
			sum1 += score2[i];
		}
		System.out.println("score 값 : " + Arrays.toString(score2));	
		
		System.out.println("합계 :" + sum1);
		System.out.println("평균 :" + (int)(sum1/7*100+0.5)/100d);
		
		int maxNum = score2[1];
		for (int i = 0; i < score2.length; i++) {
			if (maxNum < score2[i]) {
				maxNum = score2[i];
			}
		}
		System.out.println("최댓값 : " + maxNum);
		
		int minNum = score2[1];
		for (int i = 0; i < score2.length; i++) {
			if (minNum > score2[i]) {
				minNum = score2[i];
			}
		}
		System.out.println("최솟값 : " + minNum);
		
	
		
		

	}
	

}
