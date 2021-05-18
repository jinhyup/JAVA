package chapter6;

class TimeVO {				//캡슐화 : 멤버에 접근 제어를 걸어서 클래스 내부에 선언된 데이터 보호하는 것
							//또는 외부에 불필요한 부분을 감추기 위해
	private int hour;		//클래스 내 선언된 시, 분, 초를 멤버가 알 수 없게!
	private int minute;
	private int second;
	

	                                            
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		// 1. 시간은 0~ 23시까지. 매개변수에 저장된 값이 0~23로만 저장되도록 setHour구현
		this.hour = hour % 24;

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		// 2. 분은 0~59분까지. setMinute 구현
		// 단, 60분 넘으면 1시간을 의미하므로 시간이 추가되도록.
		// 예) 143분 => 2시간 23분
		this.minute = minute % 60;
		hour += minute / 60;
		hour = hour % 24;

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		// 3. 초는 0~59초까지. setSecond 구현
		// 단, 60초 넘으면 1분을 의미하므로 분이 추가되도록.
		// 예) 121초 => 2분 1초
		this.second = second % 60;
		minute += second / 60;
		hour += minute / 60;
		minute = minute % 60;
		hour = hour % 24;

	}
}
