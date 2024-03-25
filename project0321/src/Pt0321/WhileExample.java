package Pt0321;

public class WhileExample {

	public static void main(String[] args) {
		int i = 1;						//int 변수 i 선언 및 초기화
		while (i <= 10) {				//조건부여 (변수 i 가 10보다 작거나 같다면 수행한다
			System.out.println(i);		//변수 i 출력
			i++;						//i를 더한다 더한값이 10보다 작거나 같을시(while 조건문 true) 반복 수행 10보다 크거나 같을 시 (false)중단
		}

	}

}