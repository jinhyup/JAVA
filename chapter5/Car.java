package chapter5;

public class Car {
	String color;		//색상
	public String gearType;	//변속종류
	private int door;			//문의 개수
	
	private Car(){				//기본생성자 : 클래스의 필드값을 초기화하는 용도로 거의 쓰임
		
	}
	
	public Car(String color){
		this("노랑", "abc");
		this.color = color;
	}
	public Car(String color, String gearType){				
		this.color = color;
		this.gearType = gearType;
		
	}

//	public static void main(String[] args) {		//이렇게 하면 불편함
//		Car car = new Car();
//		car.color = "blue"l
//		car.gearType ="manual";
//		car.door = 5;
//	}
	
	public Car(String color, String gearType, int door){				//기본생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	
	public static void main(String[] args) {
		Car car = new Car("blue");
		Car car2 = new Car("파랑");
		System.out.println(car.color);
		System.out.println(car.gearType);
	}
	
	
}
