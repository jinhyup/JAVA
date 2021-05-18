package chapter4;

import java.util.Arrays;

public class ExArray02 {

	public static void main(String[] args) {
		// 배열 요소 자리 바꾸기

		// 1.사람 4명의 이름을 저장할 수있는변수 names를선언
		// "김씨", "이씨", "박씨", "한씨" 의 이름으로 초기화
		String[] names = new String[] { "김씨", "이씨", "박씨", "한씨" };
		System.out.println("변경전 : " + Arrays.toString(names));

		// 2. "이씨", "박씨" 위치 변경
		String temp = names[1]; // 1번 인덱스 값을 임시 저장
		names[1] = names[2]; // 1번 인덱스 값을 2번 인덱스 값으로 저장
		names[2] = temp; // 2번 인덱스 값을 임시 저장공간에 있는 1번 인덱스 값을 불러옴

		System.out.println("변경 후 :" + Arrays.toString(names));

		
		//버블정렬
		// 1. 5개의 숫자 5,2,3,1,4를 오름차순으로 정렬하는 코드를 작성하라.
		// 단, 버브정렬을이용하고 결과와 같이 출력되도록 하여라.
		int[] n = { 5, 2, 3, 1, 4, };
		int tmp;
		for (int i = 0; i < n.length; i++) {
			System.out.println(i + 1 + "회전");
			for (int j = 0; j < n.length; j++) {
				if (j + 1 < n.length) { // 배열의 길이를 벗어나지 않도록
					if (n[j] > n[j + 1]) {
						tmp = n[j];
						n[j] = n[j + 1];
						n[j + 1] = tmp;
					}
					System.out.println(Arrays.toString(n));
				}

			}
		}
		System.out.println();
		
		//선택정렬 - 오름차순
		int[] k = {5, 2, 3, 1, 4};
		int tmp01;
		int min = k[0];
		int count = 0;
		for (int i = 0; i < k.length; i++) {
			for (int j = i; j < k.length; j++) {
				count = 0;
				if (min > k[j]) {
					min = k[j];
					count++;
				}
			}
			for (int l = 0; l < k.length - 1; l++) {
				if (min < k[l]) {
					tmp01 = k[l];
					k[l] = min;
					k[count] = tmp01;
					
				}
			}
		}
		System.out.println(Arrays.toString(k));	
			
//			for (int l = 0; l < k.length; l++) {
//				if (l + 1 < k.length) {
//					if (k[i] <= k[l]) { // 둘 중 작은 값인지확인
//						tmp01 = k[i]; // 대입
//						k[i] = k[l];
//						k[l] = tmp01;
//					}
//					System.out.println(Arrays.toString(k));
//				}
//			}
		
	}

}
