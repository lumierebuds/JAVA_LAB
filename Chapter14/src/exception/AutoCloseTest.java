package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("eception");
		}

	}

}
