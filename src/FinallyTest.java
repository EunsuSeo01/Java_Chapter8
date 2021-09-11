/**
 * finally 블럭이 필요한 상황의 예제.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
public class FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();		// 예외가 발생하더라도 이 메서드는 실행되도록 함.
									// -> 이럴 때 finally 블럭을 사용하면 좋다.
		}
	}
	
	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
	}
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
}
