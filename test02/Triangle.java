package test02;

public class Triangle extends Shape1 {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}
	public double area() {
		return 3*side;
	}
	public double perimeter() {
		return Math.sqrt(3) / 4 * side;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 삼각형, 둘레:");
		builder.append(area());
		builder.append("cm, 넓이: ");
		builder.append(perimeter());
		builder.append("㎠");
		return builder.toString();
	}
	
	
}
