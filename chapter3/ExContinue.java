package chapter3;

public class ExContinue {

	public static void main(String[] args) {
		int count;// 3부터 21 사이에서 가장 큰 홀수 찾아라
		int sum = 0;
		for(count = 3; count < 21; count++) {
			if (count % 2 != 0) {
				continue;
				//조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동함.
				//break문과 달리 반복문을 벗어나지 않음
				//쉽게 말해 바로 윗 반복문 반복!!
			}
		}
		System.out.println(count);

	}

}
