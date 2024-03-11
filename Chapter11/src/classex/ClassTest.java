package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();

		// getClass(): 인스턴스를 통해 Class의 클래스를 반환
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());

		// 클래스.class : 클래스를 통해 Class의 클래스를 반환
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());

		// forName() : 클래스의 이름으로 Class의 클래스를 반환
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());

	}
}
