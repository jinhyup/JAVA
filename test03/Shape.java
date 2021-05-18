package test03;

public abstract class Shape implements Comparable<Shape> {

	public abstract double area();

	public abstract double perimeter();

	double area = area();
	double perimeter = perimeter();

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
