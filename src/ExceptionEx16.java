/**
 * 예외를 전달받은 메서드에서 예외를 처리해준 경우의 예제.
 * @author user EunSu Seo
 * last modified 2021-09-11
 */
import java.io.*;

public class ExceptionEx16 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	}
	
	static File createFile(String fileName) throws Exception {	// 예외 전달.
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않습니다.");	// 예외 발생.
		File f = new File(fileName);	// 파일 클래스의 객체를 만든다.
		// 파일 클래스의 createNewFile() 메서드를 이용해서 실제 파일을 생성한다.
		f.createNewFile();		// 예외 처리 필요함.
		return f;	// 생성된 객체의 참조를 반환한다.
	}
}