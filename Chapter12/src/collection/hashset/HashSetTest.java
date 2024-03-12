package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("aaa");
		set.add("bbb");
		set.add("ccc");

		System.out.println(set);

		// 중복된 데이터를 추가될때는 오류가 발생하지 않으나
		// 더 추가 되지 않는다. - 중복된 요소를 받지 않는다.
		set.add("aaa");

		System.out.println(set);
	}

}
