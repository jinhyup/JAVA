package test03;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return Math.round((int) (3 * side * 100)) / 100d;
	}

	public double perimeter() {
		return Math.round((int) (Math.sqrt(3) / 4 * side * side * 100)) / 100d;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 삼각형, 둘레:");
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
