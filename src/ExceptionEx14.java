/**
 * 예외를 전달받은 메서드에서 예외를 처리해준 경우의 예제.
 * @author user EunSu Seo
 * last modified 2021-09-10
 */
public class ExceptionEx14 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {	// 예외 받아서 처리!
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {	// 자신을 호출한 메서드에게 예외를 전달.
		throw new Exception();		// 예외 생성 후 발생.
	}
}