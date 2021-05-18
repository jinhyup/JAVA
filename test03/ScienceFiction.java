package test03;

public class ScienceFiction extends Book{

	public ScienceFiction(String title, String author) {
		super(title, author);
		super.setNumber(++countOfBooks);
	}

	@Override
	public int getLateFee(int latedays) {
		return latedays * 600;
	}
	
}
