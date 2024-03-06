package arrayex;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 책에 대한 공간이 5개가 만들어진다. 주소가 할당 
		Book[] library = new Book[5];
		
		library[0] = new Book("어린왕자","생텍 쥐페리");
		library[1] = new Book("1984","조지 오웰");
		library[2] = new Book("데미안","헤르만 헤세");
		library[3] = new Book("이방인","알베르 카뮈");
		library[4] = new Book("노인과 바다","헤밍웨이");
		
		for (int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
