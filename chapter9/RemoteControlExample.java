package chapter9;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl audio = new Audio();
		audio.turnOff();
		audio.turnOn();
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(20);
		tv.setMute(true); // 인터페이스를 상속받았으니 메소드 호출 가능
		RemoteControl.chageBattery();
	}
}
