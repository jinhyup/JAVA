package test01;

public class Plane {
	private String manufacturer; // 제작사
	private String model; // 비행기 모델명
	private int maxNumberOfPassengers; // 최대 승객수
	private static int numberOfPlanes; // 지금까지 생성된 비행기 객체수
	
	
	
	
	public Plane() {
		numberOfPlanes++;	
	}


	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}


	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0 ) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
		
	}


	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}


	public static void setNumberOfPlanes(int numberOfPlanes) {
		Plane.numberOfPlanes = numberOfPlanes;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Plane [manufacturer=");
		builder.append(manufacturer);
		builder.append(", model=");
		builder.append(model);
		builder.append(", maxNumberOfPassengers=");
		builder.append(maxNumberOfPassengers);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
//	Plane() {
//		String manufacturer = "0";
//		String model = "0";
//		maxNumberOfPassengers = 0;
//		numberOfPlanes++;	
//	}
//
//	Plane(String manufacturer, String model, int maxNumberOfPassengers) {
//		this.manufacturer = manufacturer;
//		this.model = model;
//		this.maxNumberOfPassengers = maxNumberOfPassengers;
//		numberOfPlanes++;	
//	}
//
//	public String getmanufacturer() {
//		return manufacturer;
//	}
//
//	public void setmanufacturer(String a) {
//		this.manufacturer = a;
//	}
//
//	public String getmodel() {
//		return model;
//	}
//
//	public void setmodel(String a) {
//		this.model = a;
//	}
//
//	public int getmaxNumberOfPassengers() {
//		return maxNumberOfPassengers;
//	}
//
//	public void setmaxNumberOfPassengers(int a) {
//		if (a >= 0) {
//			this.maxNumberOfPassengers = a;
//		}
//	}
//
//	static int getnumberOfPlanes() {
//		return numberOfPlanes;
//	}
}
