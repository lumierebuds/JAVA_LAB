package reference;

public class Circle {
	
	Point point; // Point 클래스: 참조자료형을 사용한다. 
	int radius; 
	
	public Circle(int x, int y) {
		point = new Point(x,y);
	}
}
