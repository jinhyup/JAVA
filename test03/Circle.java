package test03;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.round((int)(2 * radius * Math.PI * 100)) / 100.0;
	}
	
	@Override
	public double perimeter() {
		return Math.round((int)(Math.PI * radius * radius * 100)) / 100.0;
		}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 원, 둘레:");
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
