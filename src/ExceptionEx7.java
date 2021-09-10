/**
 * 예외가 발생했을 때 일치하는 catch블럭을 찾으면 다음 catch블럭은 검사하지 않음을 보여주는 예제.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외 발생.
			System.out.println(4);
		} catch (ArithmeticException ae) {	// 여기서 처리됨.
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {	// 위의 catch블럭에서 처리돼서 여기까진 안 온다.
			// 'ArithmeticException을 제외한' 모든 예외들은 여기서 처리됨.
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}
}
