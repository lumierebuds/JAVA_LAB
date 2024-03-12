package collection;

import java.util.ArrayList;

// ArrayList 를 활용해서 만든 스택 
class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {

		int len = arrayStack.size();

		// 배열이 비어있을때 - 스택이 비어있을때
		if (len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}

		// 배열의 마지막 요소를 뺴줘야 하기 때문에(LIFO)
		// 배열크기(len) - 1 번째 인덱스의 값을 빼준다.
		return arrayStack.remove(len - 1);

	}

}

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack stack = new MyStack();

		stack.push("a");
		stack.push("b");
		stack.push("c");

		// a,b,c 순으로 넣었으니
		// 역순으로 나오게 한다.

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		// 스택이 비어있을때 pop을 하면 null 반환
		System.out.println(stack.pop());

	}

}
