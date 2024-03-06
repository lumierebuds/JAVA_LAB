package singleton;

import java.util.Calendar;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance(); // error 발생
		

	
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1 == c2);
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

	
	}

}
