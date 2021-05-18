package test03;

public class Poet extends Book{

	public Poet(String title, String author) {
		super(title, author);
		super.setNumber(++countOfBooks);
	}
	
	@Override
	public int getLateFee(int latedays) {
		return latedays * 200;
	}

}
