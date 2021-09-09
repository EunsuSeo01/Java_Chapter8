/**
 * 예외 처리 후 printStackTrace()를 사용하여 예외가 발생한 곳을 알아보는 예제.
 * @author user EunSu Seo
 * last modified 2021-09-09
 */
public class ExceptionEx13 {
	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();		// 예외 생성.
		} catch (Exception e) {		// 예외 처리.
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();	// 예외에 대한 정보를 출력.
									// 예외가 발생한 곳 : 제일 위 줄에 써있는 메서드.
									// 그 메서드를 호출한 것 : 그 아래 줄에 써있는 메서드.
		}
	}
}
