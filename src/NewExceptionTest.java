/**
 * 사용자 정의 예외 예제.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
public class NewExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();		// 파일들을 복사한다.
		} catch (SpaceException e) {	// 사용자정의 예외가 발생한 것을 전달받아서 여기 main에서 처리. 
			System.out.println("에러 메세지: " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메세지: " + me.getMessage());
			me.printStackTrace();
			System.gc();	// Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())		// 충분히 설치할 공간이 없으면...
			throw new SpaceException("설치할 공간이 부족합니다.");
		if (!enoughMemory())	// 충분한 메모리가 없으면...
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
}

// 사용자정의 예외 클래스.
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}
// 사용자정의 예외 클래스.
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}