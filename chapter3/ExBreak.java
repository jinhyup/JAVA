package chapter3;

public class ExBreak {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		while (true) {
			sum += count;
			if (sum > 200) {
				break; // 가장 가까운 반복문을 벗어난다.
				//만약 break가 아니라 continue면 sum이 200넘을 때 if 다시 실행 
				//이 경우에는 무한반복
			}
			count++;
		}
		System.out.println("합계가 200을 넘는 정수는 : " + count + "이다.");
	}

}
