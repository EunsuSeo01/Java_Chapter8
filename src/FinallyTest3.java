/**
 * finally 블럭을 사용한 경우의 예제.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
public class FinallyTest3 {
	public static void main (String[] args) {
		// method1()은 static 메서드이므로 인스턴스 생성없이 직접 호출이 가능하다.
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;		// 현재 실행 중인 메서드를 종료한다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		// try블럭에서(or catch블럭에서) return문이 실행되어도
						// finally블럭의 문장들이 먼저 실행된 후에, 현재 실행 중인 메서드를 종료한다.
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}
}
