/**
 * try-with-resource문 사용으로 발생한 억제된 예외 예제.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
public class TryWithResourceEx {
	public static void main(String[] args) {
		// try-with-resource문의 괄호 안에 객체를 생성하는 문장을 넣으면,
		// 이 객체는 따로 close()를 호출하지 않아도 try블럭을 벗어나는 순간 자동적으로 close()가 호출된다.
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false);	// 예외가 발생하지 않는다.
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource()) {	// close()가 자동호출되면서 close내에서 생성된 예외 발생.
			cr.exceptionWork(true);		// 두번째 예외 발생. -> 억제된(suppressed) 예외로 다룬다.
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
	}
}

// try-with-resource문에 의해 자동으로 객체의 close()가 호출될 수 있으려면,
// 클래스가 AutoCloseable 인터페이스를 구현한 것이어야만 한다!
class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")가 호출됨");
		
		if (exception)
			throw new WorkException("WorkException발생!!!");
	}
	
	// 자동 호출됨.
	public void close() throws CloseException {
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생!!!");
	}
}

//사용자정의 예외 클래스.
class WorkException extends Exception {
	WorkException(String msg) { super(msg); }
}
//사용자정의 예외 클래스.
class CloseException extends Exception {
	CloseException(String msg) { super(msg); }
}