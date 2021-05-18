package chapter10;

public class ExInterface {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if (f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
			Unit u1 = f;
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스의 자손입니다.");
			Unit f1 = f;
		}
		if (f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스의 자손입니다.");
			Unit m1 = f;
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스의 자손입니다.");
			Unit a1 = f;
		}
		if (f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
			Unit o1 = f;
		}
		

	}

}
