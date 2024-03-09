package interfaceex;

public interface Sell {

	void sell();

	default void order() {
		System.out.println("구매하기");
	}
}
