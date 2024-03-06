package arrayex;

public class Book {
	private String bookName; 
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	// private 변수를 위한 get, set 메서드 
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName +","+author);
	}
	
}
