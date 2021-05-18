package test03;

public abstract class Book {
	private int number; // 관리번호
	private String title; // 책의 제목
	private String author; // 책의 저자
	static int countOfBooks = 0; // 만들어진 책의 수

	public Book(String title, String author) {
		this.setTitle(title);
		this.setAuthor(author);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean equals(Object obj) {
		Book a = (Book) obj;
		if (this.title.equals(a.title) && this.author.equals(a.author)) {
			return true;
		}
		return false;
	}

	public abstract int getLateFee(int lateDays);

	@Override
	public String toString() {
		return "관리번호 " + number + "번, 제목: " + title + ", 작가: " + author + "(일주일 연체료: " + this.getLateFee(7) + "원)";
	}

//	+ String.format("%,d",getLateFee(0)

}
