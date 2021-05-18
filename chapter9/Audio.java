package chapter9;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 켰엉.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오 껐엉.");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
