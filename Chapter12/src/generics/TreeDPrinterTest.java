package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		// toString이 호출되어 출력
		System.out.println(powder);

		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(plastic);

		// 물은 들어가면 안되는데 들어가게 되는 일이 발생한다.
		// Water는 Material 클래스를 상속받지 않아 타입으로 사용할 수 없다.
		// TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();

		printerPlastic.Printing();
	}

}
