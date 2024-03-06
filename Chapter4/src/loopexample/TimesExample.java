package loopexample;

public class TimesExample {
	public static void main(String[] args) {
		int dan = 2;
		int times = 1;
		
		for (dan=2; dan <=9; dan++) {
			if(dan%2 == 0) continue; // 짝수일땐 continue, 홀행만 출력
			for(times=1; times<=9; times++) {
				System.out.println(dan+" X "+times+" = "+(dan*times));
			}
			System.out.println();
		}
//		
//		while(dan<=9) {
//			times = 1; // 초기화 문장이 필요하다. 
//			while(times<=9) {
//				System.out.println(dan+" X "+times+" = "+(dan*times));
//				times++;
//			}
//			System.out.println();
//			dan++;
//		}
		
	}

}
