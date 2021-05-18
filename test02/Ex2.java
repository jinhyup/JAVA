package test02;

public class Ex2 {

	public static void main(String[] args) {
		Shape1[] shapes = new Shape1[3];
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		for (Shape1 shape : shapes) {
			System.out.println(shape);
		}
	}

}
