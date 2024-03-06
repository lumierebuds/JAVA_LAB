package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int sum = 0; // 값을 초기화해줘야 number를 더할 수 있다.
		
		while(number <= 10){
			sum +=number;
			number++;
		} 
		
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		System.out.println(number);
	}

}
