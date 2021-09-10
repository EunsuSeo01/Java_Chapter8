/**
 * Exception클래스로 모든 예외를 처리할 수 있다.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외가 발생하면 해당 예외 클래스의 인스턴스가 생성된다!
			System.out.println(4);
		} catch (Exception e) {		// ArithmeticException 대신 Exception을 사용.
									// Exception은 모든 예외 클래스의 조상이라서 어떤 예외든 다 커버 가능!
									// ArithmeticException인스턴스는 Exception클래스와의 instanceof 연산이 true가 나오기 때문.
			System.out.println(5);
		}
		System.out.println(6);
	}
}
