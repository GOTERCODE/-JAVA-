package Pt0321;

public class Long2Example {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 2행 3열의 2차원 배열인 mathScores를 선언하고, 메모리를 할당

		for (int i = 0; i < mathScores.length; i++) { // mathScores 배열의 행을 순회하는 반복문을 시작합니다. 루프 변수 i는 행 인덱스
			for (int j = 0; j < mathScores[1].length; j++) {
				// 바깥쪽 반복문 내에 중첩된 또 다른 반복문을 시작. 이 반복문은 배열의 열을 순회 mathScores[1].length는 두 번째 행의
				// 길이를 가져오는 데 사용되며, 다른 행들과 길이가 동일하다고 가정
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
				// mathScores 배열의 각 요소의 값을 출력. i와 j는 각각 현재의 행과 열 인덱스
			}
		}
		System.out.println("-------------------------------------------------------------");

		mathScores[1][0] = 80; // mathScores 배열의 특정 요소에 값을 할당
		mathScores[1][2] = 99;

		for (int i = 0; i < mathScores.length; i++) { // mathScores 배열의 행을 다시 순회하는 반복문을 시작
			for (int j = 0; j < mathScores[i].length; j++) { // 또 다른 중첩된 반복문을 시작하여 배열의 열을 순회
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]); // mathScores 배열의 각 요소의
																								// 업데이트된 값을 출력
			}
		}
	}
}
