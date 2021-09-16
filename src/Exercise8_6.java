/**
 * Chapter 8 연습문제 6번 코드.
 * @author user EunSu Seo
 * last modified 2021-09-17
 */
public class Exercise8_6 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
	}
	
	static void method1() {
		try {
			method2();		// 이게 checked예외였다면, throws로 메서드에 예외 선언해둬야 했을 것.
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		
		System.out.println(4);
	}
	
	static void method2() {
		throw new NullPointerException();		// RuntimeException의 자손! -> unchecked예외.
	}
}
