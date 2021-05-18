package chapter6;

class Extend3 {
	Parent pt = new Parent();

	class Parent {
		public int x = 10;
	}

	class Child12 extends Extend3 {

		int x = 30;

		void method(int x) {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(super.pt.x);

		}
	}

}
