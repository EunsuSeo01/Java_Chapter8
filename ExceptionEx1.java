/**
 * 예외처리를 위한 try-catch문 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-09-06
 */
// 1. 하나의 메서드에 여러 개의 try-catch문이 올 수 있다.
// 2. try블럭, catch블럭 내에 또 다른 try-catch문이 포함될 수 있다.
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			// 예외가 발생할 가능성이 있는 문장들을 이 안에 넣는 것.
			try {  } catch (Exception e) {  }
		} catch (Exception e) {
			try {  } catch (Exception e) {  }	// 에러. 변수 e가 중복 선언됨.
		}										// 각 catch블럭에 선언된 두 참조변수의 영역이 서로 겹쳐서.
		
		try {
			
		} catch (Exception e) {	// 이 참조변수 e는 catch블럭 내에서만 유효한 것!
			
		}
	}
}