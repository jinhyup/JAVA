package chapter6;

import chapter5.Car;

public class SingletonExample {

	public static void main(String[] args) {
		// 싱글톤
		MySingleton instance1 = MySingleton.getInstance(); // 객체가 한 개 만들진 상태에서 변수를 지정하는 것
		MySingleton instance2 = MySingleton.getInstance();

		if (instance1 == instance2) {
			System.out.println("같다"); // 같은 값 }
		}
		
		// 싱글톤X
		Car car1 = new Car("a"); // 객체를 두 개 만듦
		Car car2 = new Car("a");
		if (car1 == car2) {
			System.out.println("car는 같은 객체"); // 다른 객체니까 false임
		}
	}

}
