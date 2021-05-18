package test03;

public class Novel extends Book{

	public Novel(String title, String author) {
		super(title, author);
		super.setNumber(++countOfBooks);
	}
	
	
	@Override
	public int getLateFee(int latedays) {
		return latedays * 300;
	}

}
