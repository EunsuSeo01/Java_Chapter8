/**
 * 컴파일러가 예외처리를 확인하지 않는 RuntimeException클래스들(unchecked예외)의 throw 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-09-07
 */
public class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException();	// 컴파일 에러는 안 난다! 성공적으로 컴파일됨.
	}	// 그러나 실행하면 RuntimeException이 발생하여 비정상적으로 종료됨.
		// 'RuntimeException클래스와 그 자손(= RuntimeException클래스들)'에 해당하는 예외는
		// 프로그래머의 실수로 발생하는 것들이라서 예외처리를 강제하지 않는 것이다.
}
