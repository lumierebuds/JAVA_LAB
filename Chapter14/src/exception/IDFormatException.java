package exception;

// Exception 클래스 상속 
public class IDFormatException extends Exception {

	// IDFormatException 클래스 생성시 에러 메시지 전달
	public IDFormatException(String message) {
		super(message);
	}

}
