package innerclass;

// 내부 클래스: 클래스 내부에 선언된 또 다른 클래스 

class Creature {
	int life;

	static class Animal {

	}

	static class Insect {

	}

	static public void method() {
		Animal animal = new Animal();
		Insect insect = new Insect();
	}
}

public class test {

	public static void main(String[] args) {
		Creature.method();
	}

}
