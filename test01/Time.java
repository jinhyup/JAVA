package test01;

public class Time {
	private int hour;
	private int minute;
	private int second;

	
	
	public Time() {
		int hour = 0;
		int minute = 0;
		int second = 0;
	}

	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;			
		} else {
			this.hour = 0;			
		}
		
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;			
		} else {
			this.minute = 0;
		}
		if (second >= 0 && second <= 59) {
			this.second = second;			
		} else {
			this.second = 0;			
		}
	}
	
	 public String toString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
