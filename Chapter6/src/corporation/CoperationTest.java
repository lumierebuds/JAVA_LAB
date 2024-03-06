package corporation;

public class CoperationTest {

	public static void main(String[] args) {
		Student james = new Student("james",5000);
		Subway secondLine = new Subway(2);
		Bus incheonAirport = new Bus(44);
		
		
		// james의 정보를 출력
		james.showInfo();
		// james가 버스를 타고, 내린다.
		james.takeBus(incheonAirport);
		incheonAirport.showInfo();
		incheonAirport.off(james);
		incheonAirport.showInfo();
		
		// james가 지하철을 타고, 내린다.
		james.takeSubway(secondLine);
		secondLine.showInfo();
		secondLine.off(james);
		secondLine.showInfo();
		
		// james의 정보를 출력
		james.showInfo();
	}

}
