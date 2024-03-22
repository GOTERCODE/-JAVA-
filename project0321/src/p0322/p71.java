package p0322;

import java.util.Scanner;

public class p71 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);				// Scanner class 선언
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();						// .nextLine 문자열을 입력받을때 사용하는 메소드 (공백포함) | .next : 공백을 포함하지 않는다. (공백이 나올 때 까지 하나의 문자열로 인식)
		int x = Integer.parseInt(strX);							//  Integer.parseInt : 데이터타입 String을 int로 변환
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;										// 변수 선언 result는 변수 x+y
		System.out.println("x + y: " + result);
		System.out.println();
		
		
		while(true) {											// 무한루프. 괄호안에 있는 조건이 true가 될때까지 반복한다
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {								// 입력된 문자열이 q라면 반복을 중지한다
				break;

		}

		System.out.println("출력 문자열: " + data);
		System.out.println();
	}
		scanner.close();
		System.out.println("종료");

	}
}
