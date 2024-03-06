package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1:
				medalColor = 'G'; // 'Golden'
				break;
			case 2:
				medalColor = 'S';	// 'Silver'
				break;
			case 3: 
				medalColor = 'B';	// 'Bronze'
				break;
			default:
				medalColor = 'A';
		}
		System.out.println(rank+"등 메달의 색깔은 "+medalColor+"입니다.");
	}

}
