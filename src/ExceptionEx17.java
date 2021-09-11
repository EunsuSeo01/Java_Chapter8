/**
 * 예외 되던지기 예제. -> 양쪽의 catch블럭이 모두 수행됨.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
public class ExceptionEx17 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {		// 예외를 전달받아서 호출한 메서드에서도 예외 처리.
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}
	
	static void method1() throws Exception {	// 예외 전달.
		try {
			throw new Exception();
		} catch (Exception e) {		// 메서드 내부적으로 예외 처리.
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;	// *예외를 다시 발생시킨다! -> Exception re-throwing.
		}
	}
}
