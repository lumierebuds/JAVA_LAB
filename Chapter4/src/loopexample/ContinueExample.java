package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		for(i = 1; i <= 100;i++) {
			if(i%2==0) continue; // i가 2로 나누어떨어질때(짝수일때), continue수행해 다시 조건식수행
			sum+=i;
		}
		System.out.println(sum);
	}

}
