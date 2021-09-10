/**
 * 예외가 발생한 메서드에서 직접 예외를 처리하도록 한 예제.
 * @author user EunSu Seo
 * last modified 2021-09-10
 */
import java.io.*;

public class ExceptionEx15 {
	public static void main(String[] args) {
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	}
	
	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");	// 예외 발생.
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
		} finally {		// finally블럭 : '예외 발생여부에 관계없이' 늘 실행.
			File f = new File(fileName);	// File클래스의 객체를 만든다.
			createNewFile(f);	// 생성된 객체를 이용하여 파일을 생성한다.
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();	// createNewFile() : 파일을 생성하는 메서드.
								// + 예외가 선언된 메서드. -> try-catch문을 통한 예외처리를 필요로 해서
								// 따로 내부적으로 예외처리를 하는 이 메서드를 만들어서 처리해 줌.
		} catch (Exception e) {	};
	}
}
