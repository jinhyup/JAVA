package test02;

public class Rectangle extends Shape1 {
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return 2 * (this.width + this.height);
	}
	
	public double perimeter() {
		return this.width * this.height;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 사각형, 둘레:");
		builder.append(area());
		builder.append("cm, 넓이: ");
		builder.append(perimeter());
		builder.append("㎠");
		return builder.toString();
	}
	
}
