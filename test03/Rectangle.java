package test03;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return Math.round((int)(2 * (this.width + this.height) * 100)) / 100d;
	}
	
	@Override
	public double perimeter() {
		return Math.round((int) (this.width * this.height * 100)) / 100d;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 사각형, 둘레:");
		builder.append(area());
		builder.append("cm, 넓이: ");
		builder.append(perimeter());
		builder.append("㎠");
		return builder.toString();
	}
	
	public int compareTo(Shape shape) {
		if (this.perimeter() < shape.perimeter()) {
			return -1;
		} else if (this.perimeter() > shape.perimeter()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
