package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sList = new ArrayList<String>();

		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");

		// sList를 Stream<String> 타입 변수에 저장
		Stream<String> stream = sList.stream();
		// 하나의 요소별로 출력하도록 한다. - forEach
		stream.forEach(s -> System.out.println(s));

		// 변수를 쓰지 않고 스트림 연산
		// sorted(): 중간연산, forEach(): 최종 연산
		sList.stream().sorted().forEach(s -> System.out.println(s));
	}

}
