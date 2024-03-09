package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);

	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub

		// 맨 앞에 있는 요소를 추출 , 0번째 자리
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
