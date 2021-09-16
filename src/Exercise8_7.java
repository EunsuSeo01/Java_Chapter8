/**
 * Chapter 8 연습문제 7번 코드.
 * @author user EunSu Seo
 * last modified 2021-09-17
 */
public class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				System.exit(0);		// 프로그램 즉시 종료.
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {					// 이럴 땐 finally블록이 수행되지 않는다!
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);	// 여기까지 안 오고 프로그램 종료됨.
	}
}
