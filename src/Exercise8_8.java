/**
 * Chapter 8 연습문제 8번 풀이.
 * @author user EunSu Seo
 * last modified 2021-09-17
 */
import java.util.*;

public class Exercise8_8 {
	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		// + 1을 함으로써 0이상 100미만 -> 1이상 101미만이 됨.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;	// 사용자입력을 저장할 공간.
		int count = 0;	// 시도횟수를 세기 위한 변수.

		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요 : ");

			try {
				input = new Scanner(System.in).nextInt();	// 키보드로부터 정수 입력 받기.
				// 정수가 아닌 입력값이 들어오면 예외가 발생할 수 있으니까 try-catch문으로 처리.
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해 주세요.");
				continue;	// 이거 쓰면 아래 코드 skip할 수 있음.
			}
			
			if (answer > input)
				System.out.println("더 큰 수를 입력하세요.");
			else if (answer < input)
				System.out.println("더 작은 수를 입력하세요.");
			else {
				System.out.println("맞혔습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;	// 맞혔으니 do-while문 탈출.
			}
		} while(true);	// 무한반복문.
	}
}
