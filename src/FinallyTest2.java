/**
 * finally 블럭을 사용한 경우의 예제.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
public class FinallyTest2 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();		// 예외 발생 여부에 상관없이 실행되도록.
		}
	}
	
	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
	}
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
}

