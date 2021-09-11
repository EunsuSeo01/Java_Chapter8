/**
 * 연결된 예외(Chained Exception) 예제.
 * @author user EunSu Seo
 * last modified 2021-09-12
 */
public class ChainedExceptionEx {
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void install() throws InstallException {		// 이 메서드를 호출한 메서드에게 예외를 전달.
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException2 e) {	// 전달받은 예외를 처리.
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(e);	// ie의 원인 예외가 e임을 등록.
			throw ie;			// 여러가지 예외를 하나의 큰 분류의 예외로 묶어서 다루기 위함.
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(me);	// ie의 원인 예외가 me임을 등록.
			throw ie;			// 여러가지 예외를 하나의 큰 분류의 예외로 묶어서 다루기 위함.
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {	// 자신을 호출한 메서드에게 예외 전달.
		if (!enoughSpace())		// 충분히 설치할 공간이 없으면...
			throw new SpaceException2("설치할 공간이 부족합니다.");
		if (!enoughMemory()) {  // 충분한 메모리가 없으면...
			throw new MemoryException2("메모리가 부족합니다.");
			// throw new RuntimeException(new MemoryException2("메모리가 부족합니다."));
			// -> checked 예외를 unchecked예외로 바꿔주고, 원인 예외를 등록하는 생성자를 사용한 것.
		}
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
class InstallException extends Exception {
	InstallException(String msg) { super(msg); }
}

// 사용자정의 예외 클래스.
class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

// 사용자정의 예외 클래스.
class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}
