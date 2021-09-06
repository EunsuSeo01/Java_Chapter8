/**
 * 예외를 발생시키는 키워드 throw의 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");		// 예외 클래스의 객체를 생성!
									// 생성자에 넣어준 String이 Exception인스턴스의 메세지로 저장되는 것.
			throw e;	// 예외를 발생시킴.
			// throw new Exception("고의로 발생시켰음."); 와 같은 코드.
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
}
