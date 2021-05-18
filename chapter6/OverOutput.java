package chapter6;

public class OverOutput {
	public static void main(String[] args) {
		OverGo og = new OverGo();
		System.out.println(og.upMethod());
		System.out.println(og.downMethod());
		System.out.println(og.downMethod());

	}

}
