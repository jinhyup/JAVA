package chapter9;

public class Television implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("티비 켰엉.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비 껐엉.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

	@Override
	public void search(String word) {
		// TODO Auto-generated method stub
		
	}
	
}
