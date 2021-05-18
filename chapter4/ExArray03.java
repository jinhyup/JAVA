package chapter4;

import java.util.Random;

public class ExArray03 {

	public static void main(String[] args) {
//		int[][] score = new int[3][4];
//		score[0][0] = 100; //배열 score의 1행 1열에 100을 저장
//		System.out.println(score[0][0]);
//		
//		int[][] arr = {
//						{1, 2, 3},
//						{4, 5, 6}
//					  };
//		
//		System.out.println(arr.length);			//행의 길이
//		System.out.println(arr[0].length);		//0번째 행의 배열에 저장된 요소의수량

		
		//2차원 배열 - 점수 테이블
		int[][] score01 = new int[][] {
										{100, 70, 30},
										{45, 76, 88},
										{37, 45, 28},
										{47, 89, 100},			//,은 영향 안 준다.
									};
									
		System.out.println("\t국어\t영어\t수학"); 				// 상단 과목을 출력
		for (int row = 0; row < score01.length; row++) {
			System.out.print(row + 1);
			for (int column = 0; column < score01[row].length; column++) {
				System.out.print("\t" + score01[row][column]);
			}
			System.out.println();
		}		
	}
}
