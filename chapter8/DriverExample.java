package chapter8;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Taxi());
//		Taxi taxi = new Taxi();
//		taxi.start();
		driver.drive(new Bus());

		// 하위 객체 다 불러올 수 있음
		// 이것이 다형성
	}
}
