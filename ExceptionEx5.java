/**
 * try-catch문의 예외발생 유무에 따른 실행 순서를 볼 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 일부러 0으로 나눠서 ArithmeticException을 발생시킨 것. -> catch블럭으로 넘어감.
			System.out.println(4);		// 예외가 발생한 위치 이후의 try블럭의 문장들은 실행되지 않음!
		} catch (ArithmeticException ae) {
			System.out.println(5);		// 실행됨. 예외가 발생했기 때문.
		}
		
		System.out.println(6);
	}
}