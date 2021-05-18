package chapter4;

import java.util.Arrays;
import java.util.Random;

public class ExArray04 {

	public static void main(String[] args) {
		Random random = new Random();
		//랜덤성적입력
		String[] names = {"진협", "성민", "인환", "병준","민석", "재헌"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Java", "Oracle"};
		int[][] score = new int[names.length][subjects.length];		//2차원 배열
		for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
						score[i][j] = random.nextInt(101);
				}
		}
		//성적합계변수
		int[] nameSum = new int[names.length];					
		for (int i = 0; i < names.length; i++) {
			for (int k02 = 0; k02 < subjects.length; k02++) {
				nameSum[i] += score[i][k02];				
			}
		}
		System.out.println(Arrays.toString(nameSum));
		
		//학생별 성적 평균내기
		float[] nameAvg = new float[names.length];
		for (int i = 0; i < nameAvg.length; i++) {
			nameAvg[i] = (int)((float)nameSum[i] / names.length * 100 +0.5)/100f;
		}
		System.out.println(Arrays.toString(nameAvg));
		
		//
	}

}
