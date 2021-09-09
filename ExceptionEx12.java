/**
 * 예외 처리를 하지 않고 자신을 호출한 메서드에게 예외를 떠넘기는 throws의 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-09-09
 */
public class ExceptionEx12 {
	public static void main(String[] args) throws Exception {	// 예외 떠넘기기.
		method1();
	}
	
	static void method1() throws Exception {	// 예외 떠넘기기.
		method2();
	}
	
	static void method2() throws Exception {	// 예외 떠넘기기. (처리X, 단순 전달일 뿐)
		throw new Exception();		// 예외 생성.
	}
}
