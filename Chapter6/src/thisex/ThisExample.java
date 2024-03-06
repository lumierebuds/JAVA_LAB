package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birthday d1 = new Birthday();
		Birthday d2 = new Birthday();
		
		System.out.println(d1);
		d1.printThis();
		
		System.out.println(d2);
		d2.printThis();
		
		
	}

}
