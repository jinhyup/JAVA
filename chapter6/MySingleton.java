package chapter6;

public class MySingleton {
	private static MySingleton instance = new MySingleton(); //static을 붙이면 클래스가 생성되기 전에 뉴 마이싱글턴이 생성됨. 직접 접근 불가능해짐
	public static MySingleton getInstance(){
		return instance;
	}
}

//책에 있는대로 
//public class MySingleton {
//	private static MySingleton instance; //static을 붙이면 클래스가 생성되기 전에 뉴 마이싱글턴이 생성됨. 직접 접근 불가능해짐
//	private MySingleton() {
//	}
//	public MySingleton getInstance(){
//		if(instance == null) {
//			 instance = new MySingleton();
//		}
//		return instance;
//	}
//}
