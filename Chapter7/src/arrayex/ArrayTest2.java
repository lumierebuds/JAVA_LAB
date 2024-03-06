package arrayex;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] num = new double[5];
		
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		double total = 1;
		for(int i=0; i<num.length;i++) {
			if(num[i] == 0) {
				break;
			}
			total *= num[i];
			
		}
		
		System.out.println(total);
	}

}
