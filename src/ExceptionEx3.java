/**
 * try-catch문을 이용한 예외 처리 예제.
 * @author user EunSu Seo
 * last modified 2021-09-06
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10);	// 0~9까지 가능.
										// 예외 발생 가능성 O -> 예외 처리!
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눠졌다.");		// 예외가 발생하면 이 문장을 실행 후 try-catch문을
														// 벗어나서 for문의 다음 반복을 계속 수행한다.
			}
		}
	}
}
