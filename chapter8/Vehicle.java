package chapter8;

public abstract class Vehicle {
//	public void run() {
//		System.out.println("차량이 달립니다.");
//	}
	
	//만약 bus, taxi 등의 클래스를 상속받는 클래스가 있는 경우
	//차량이 달립니다. 가 필요가 없음
	// 그럴 경우
	public abstract void run(); //이런식으로 추상화함! 그러나 에러가 생김
	public final void start() {
		System.out.println("시동");
	}
	
}
