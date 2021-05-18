package chapter9;

public interface RemoteControl {
	public static final int MAX_VOLUME = 100; // 변수는 불가능, 상수는 가능
	int MIN_VOLUME = 0;

	void turnOn();

	void turnOff();

	void setVolume(int volume);
	
	
	//일반메소드도 선언가능
	 default void setMute (boolean mute) {  //default를 빼면 오류가 왜 나는것인가?
		if (mute) {
			System.out.println("음소거 모드");
		} else {
			System.out.println("음소거 해제");
		}
	}
	 
	 static void chageBattery() { //static은 인터페이스에 포함된 게 아니라 메소드로 감
		 System.out.println("건전지를 교체하세용.");
	 }

	
}
