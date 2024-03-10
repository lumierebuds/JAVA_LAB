package object;

class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 인스턴스를 출력할때, 정보를 출력한다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + "," + author;
	}

}

public class ToStringEx {

	public static void main(String[] args) {

		Book book = new Book("두잇자바", "은종님");

		System.out.println(book);

		// String 클래스의 인스턴스를 출력하면 문자가 출력된다.
		// 입력된 문자가 출력되는 이유는 String 클래스에
		// toString 이 재정의 되어 있기 때문이다.
		String str = new String("test");
		System.out.println(str);
	}

}
