package test01;

public class Car {
	private double speed;
	private String color;
	private static final int MAX_SPPED = 200;
	
	public Car() {
	}

	public Car(String color) {
	
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	static double getMAX_SPPED() {
		return MAX_SPPED;
	}

	public boolean speedUp(double speed) {
		if (speed >= 0 && speed <= MAX_SPPED) {
			this.speed += speed;
			if (this.speed > MAX_SPPED) {
				this.speed = MAX_SPPED;
			}
			return true;	
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [speed=");
		builder.append(speed);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return  builder.toString();
	}
	
		
	
//	Car() {
//	}
//	
//	Car(String color) {
//		this.color = color;
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	public double getSpeed() {
//		return speed;
//	}
//	
//	public void setSpeed(double speed) {
//		this.speed = speed;
//	}
//	
//	static double getMAX_SPPED() {
//		return MAX_SPPED;
//	}
//	
//	boolean speedUp(double speedUp) {
//		if (speedUp < 0 || speedUp > MAX_SPPED ) {
//			return false;
//		} else {
//			this.speed += speedUp;
//			return true;			
//		}
//		
//	}
}
