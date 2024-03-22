package Pt0321;

public class IfNestedExample {							// 중첩 if문

	public static void main(String[] args) {
		int score = 84;
		
		if (score >= 90) {
			System.out.print("A");					//변수 score가 90보다 크거나 같을(true) 경우 A출력 false면 다음 코드 실행
			if (score >= 95) {						//if문 중첩
				System.out.print("+");				//변수 score가 95보다 크거나 같을 경우 +출력
			} else { System.out.print("-");			//위 조건이 false면 - 출력
		}
		} else {
			System.out.print("B");					
			if (score >= 85) {
			System.out.print("+");
			} else {
				System.out.print("-");
			}
		}

	}

}
