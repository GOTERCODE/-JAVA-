package Pt0321;

public class BreakExample {

	public static void main(String[] args) {
		
		int i = 1;								//int i 변수 선언 i=1
		
		while (true) {							//무한반복
			System.out.println(i);
			
			if (i == 6) 						//조건 i가 6과 같다면
				break;							//종료
				
			i = i + 1;							//증감식
		}

	}

}
