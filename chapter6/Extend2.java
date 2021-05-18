package chapter6;

import chapter6.Extend3.Child12;

public class Extend2 {							
	public static void main(String[] args) {	
//		Child12 c = new Extend3.Child12();
//		Extend3.c.method(3);
		Extend3 extend3 = new Extend3();
		Child12 child12 = extend3. new Child12();
		System.out.println(child12.x);
	}
}





