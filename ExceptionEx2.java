/**
 * 예외 발생 예제.
 * @author user EunSu Seo
 * last modified 2021-09-06
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			result = number / (int) (Math.random() * 10);	// 0~9까지 가능. -> ArithmeticException 발생 가능성!
			System.out.println(result);
		}
	}
}
