package generics;

// T: 어떤 타입이든 받을 수 있도록 설정한다. 
// T 타입에 제한을 줘서 타입을 정할 수 있다.  
public class TreeDPrinter<T extends Material> {

	// <T extends 클래스> : 해당 클래스를 상속받은 클래스들만을 타입으로 둘 수 있다.

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public void Printing() {
		material.doPrinting();
	}

}
