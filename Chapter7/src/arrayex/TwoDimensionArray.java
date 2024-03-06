package arrayex;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j]= ch++;
			}
		}
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.println(alphabets[i][j]);
			}
		}
		
		
	}

}
