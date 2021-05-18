package test01;

public class NewCar {
	//1mile = 1.6km
	private double speed = 0;
	private String color = null;
	private static int MAX_SPPED = 200;

	
	NewCar() {
		}

	NewCar(String color) {
			this.color = color;
		}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		speed = killoToMile(speed);
		speed = MileTokillo(speed);
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	boolean speedUp(double speedUp) {
		speedUp = killoToMile(speedUp);
		speedUp = MileTokillo(speedUp);
		if (speedUp < 0 || speedUp > MAX_SPPED) {
			return false;
		} else {
			this.speed += speedUp;
			return true;
		}
		
	}
	
	static double getMAX_SPPED() {
		return MAX_SPPED;
	}

	private double killoToMile (double distance) {	//단위변환 메소드 mile로
		distance = distance/1.6d;
		return distance;
	}
	private double MileTokillo (double distance) {	//단위변환 메소드 km로
		distance = 1.6 * distance;
		return distance;
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
	
	
	
}
