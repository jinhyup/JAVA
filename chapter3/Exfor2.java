package chapter3;

public class Exfor2 {

	public static void main(String[] args) {
		int dan, gob;
		for (dan = 2; dan < 10; dan++) // 구구단
			for (gob = 1; gob < 10; gob++)
				System.out.println(dan + " * " + gob + " = " + dan * gob);

		for (dan = 2; dan < 10; dan += 2) // 구구단 짝수단만
			for (gob = 1; gob < 10; gob++)
				System.out.println(dan + " * " + gob + " = " + dan * gob);

		for (dan = 2; dan < 10; dan++) // 구구단 짝수단만2
			if (dan % 2 == 0) {
				for (gob = 1; gob < 10; gob++)
					System.out.println(dan + " * " + gob + " = " + dan * gob);
			}

		for (dan = 2; dan < 10; dan++) // 구구단 홀수단만
			if (dan % 2 == 1) {
				for (gob = 1; gob < 10; gob++)
					System.out.println(dan + "*" + gob + " = " + dan * gob);
			}
		//////////////////////////////////////////////////////								
		for (int i = 0; i < 6; i++) {		// '*' 갯수를 늘려가며 출력하기
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		//////////////////////////////////////////////////////
		for (int count = 0; count < 3; count++) {	//'***'를 세 번 출력
		for (int star = 0; star < 3; star++) {
			System.out.print('*');
			}
		System.out.println();
		}
		///////////////////////////////////////////////////////
		
	}
}
