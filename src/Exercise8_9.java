/**
 * Chapter 8 연습문제 9번 풀이.
 * @author user EunSu Seo
 * last modified 2021-09-17
 */
public class Exercise8_9 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

// 사용자정의 예외 클래스. RuntimeException를 조상으로 함.
class UnsupportedFunctionException extends RuntimeException {
	private final int ERR_CODE;		// final 초기값을 선언할 때 설정 해놓지 않으면,
	
	UnsupportedFunctionException(String message, int errCode) {
		super(message);
		ERR_CODE = errCode;			// 이렇게 생성자를 통해 받을 수 있음!
									// 선언할 때 초기화해 놨으면 이렇게 나중에 바꿀 수 없음. 오류남.
	}
	UnsupportedFunctionException(String message) {
		this(message, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
