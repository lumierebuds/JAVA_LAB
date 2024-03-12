package collection;

import java.util.ArrayList;

//ArrayList 를 활용해서 만든 큐
class MyQueue {

	private ArrayList<String> arrayQueue = new ArrayList<String>();

	public void enQueue(String data) {
		arrayQueue.add(data);
	}

	public String deQueue() {

		int len = arrayQueue.size();

		if (len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}

		// 먼저 들어온 데이터를 빼야하기 때문에(FIFO)
		// 맨 앞 - 0번째 인덱스의 값을 뺀다.
		return arrayQueue.remove(0);

	}

}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue queue = new MyQueue();

		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");

		// a,b,c 순으로 넣었으니
		// 넣었던 순서대로 나온다.

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		// 큐가 비어있을때 deQueue을 하면 null 반환
		System.out.println(queue.deQueue());
	}

}
