package Pt0321;

public class DoWhileExample {

	public static void main(String[] args) {
		int i = 1;							//int 데이터타입 변수 i 선언

		do {								//실행
			System.out.println(i++);		//변수 i의 증감식
		} while (i <= 5);					//i가 5보다 작거나 같은 조건이 true일시
	}

}
