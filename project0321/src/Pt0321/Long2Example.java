package Pt0321;

public class Long2Example {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 2�� 3���� 2���� �迭�� mathScores�� �����ϰ�, �޸𸮸� �Ҵ�

		for (int i = 0; i < mathScores.length; i++) { // mathScores �迭�� ���� ��ȸ�ϴ� �ݺ����� �����մϴ�. ���� ���� i�� �� �ε���
			for (int j = 0; j < mathScores[1].length; j++) {
				// �ٱ��� �ݺ��� ���� ��ø�� �� �ٸ� �ݺ����� ����. �� �ݺ����� �迭�� ���� ��ȸ mathScores[1].length�� �� ��° ����
				// ���̸� �������� �� ���Ǹ�, �ٸ� ���� ���̰� �����ϴٰ� ����
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
				// mathScores �迭�� �� ����� ���� ���. i�� j�� ���� ������ ��� �� �ε���
			}
		}
		System.out.println("-------------------------------------------------------------");

		mathScores[1][0] = 80; // mathScores �迭�� Ư�� ��ҿ� ���� �Ҵ�
		mathScores[1][2] = 99;

		for (int i = 0; i < mathScores.length; i++) { // mathScores �迭�� ���� �ٽ� ��ȸ�ϴ� �ݺ����� ����
			for (int j = 0; j < mathScores[i].length; j++) { // �� �ٸ� ��ø�� �ݺ����� �����Ͽ� �迭�� ���� ��ȸ
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]); // mathScores �迭�� �� �����
																								// ������Ʈ�� ���� ���
			}
		}
	}
}
