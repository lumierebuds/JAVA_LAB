package exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("close()");

	}

}
