package test01;

public class Circle {
	private double radius;
	private double x;
	private double y;

	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x  = x;
	}

	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if (r > 0) {
			this.radius = r;	
		} else {
			this.radius = 0;
		}
	}	
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
