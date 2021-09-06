/**
 * try-catch문의 예외발생 유무에 따른 실행 순서를 볼 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);		// 예외가 발생하지 않았기 때문에 catch블럭 안의 문장은 실행되지 않는다.
		}
		
		System.out.println(6);
	}
}
