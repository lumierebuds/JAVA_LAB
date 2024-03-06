package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum > 100) break;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
