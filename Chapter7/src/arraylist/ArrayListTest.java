package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> List = new ArrayList<String>(); 
		
		List.add("add");
		List.add("add");

		for(String s: List) {
			System.out.println(s);
		}
		
		for(int i=0; i<List.size(); i++) {

			System.out.println(List.get(i));
			
		}
	}

}
