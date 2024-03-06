package corporation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	// 승객을 한명 태웠을떄의 메서드 
	public void take(int money) {
		passengerCount++;
		this.money += money;
		System.out.println("승객 1명이 "+lineNumber+"지하철에 탔습니다.");
	}
	
	// 승객을 한명 내렸을떄의 메서드 
	public void off(Student student) {
		passengerCount--;
		System.out.println("승객"+student.studentName+"이 내렸습니다.");
	}
	
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"번의 승객은 "+passengerCount+"명이고. 수익은"
				+money+"원 입니다.");
		
	}
	
}
