package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		// 스트림 생성해서 변수에 저장했다.
		// 해당 스트림은 한번 연산이 끝난이후 연산을 하지 못하도록 되어있다.
		// (오류 발생)
		IntStream stream = Arrays.stream(arr);

		int sum = stream.sum();
		System.out.println(sum);

		int count = (int) Arrays.stream(arr).count();
		System.out.println(count);

	}

}
