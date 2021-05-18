package chapter8;


public class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
//	@Override
//	public void start() {	//Vehicle에 final 붙여서 에러남
//		super.start();
//	}
}

