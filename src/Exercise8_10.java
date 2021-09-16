/**
 * Chapter 8 연습문제 10번 풀이.
 * @author user EunSu Seo
 * last modified 2021-09-17
 */
public class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(7);
		}
	}
	
	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;	// 예외 되던지기. throw 이후의 코드들은 실행되지 않음. -> finally 말고.
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		
		System.out.println(5);	// 실행 안 됨!!!
	}
	
	static void method2() {
		throw new NullPointerException();
	}
}
