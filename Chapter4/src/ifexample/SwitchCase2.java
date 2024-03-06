package ifexample;

public class SwitchCase2 {
	
	public static void main(String[] args) {
		int month = 3;
		int day; 
		
		switch(month) {
			// 여러 조건일때 동일한 실행문을 수행할때, case문을 같이 쓸 수 있다. 
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			case 4: case 6: case 9: case 11:  
				day = 30;
				break;
			default:
				day = 0;
				break;
		}
		
		System.out.println(month+"월은 "+day+"일까지의 일수를 가진다.");
		
	}
}
