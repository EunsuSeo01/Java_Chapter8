/**
 * 예외에 대한 정보를 알려주는 printStackTrace()와 getMessage()의 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx8 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외 발생.
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();	// 호출스택에 있던 메서드의 정보와 예외 메세지를 출력해줌.
			System.out.println("예외 메세지: " + ae.getMessage());		// 인스턴스에 저장된 메세지를 반환.
		}
		System.out.println(6);
	}
}