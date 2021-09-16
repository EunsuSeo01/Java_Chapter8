/**
 * Chapter 8 연습문제 5번 코드.
 * @author user EunSu Seo
 * last modified 2021-09-16
 */
public class Exercise8_5 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();	// RuntimeException이 조상!
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);	// return;을 만나도 finally블럭 실행되고 끝남.
		}
		
		System.out.println(6);		// 위에서 return; 만나면 실행 안 되는 줄.
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}
}
