package test02;

public class Circle extends Shape1 {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return 2 * radius * Math.PI;
	}
	public double perimeter() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 원, 둘레:");
		builder.append(area());
		builder.append("cm, 넓이: ");
		builder.append(perimeter());
		builder.append("㎠");
		return builder.toString();
	}
	
	
}
