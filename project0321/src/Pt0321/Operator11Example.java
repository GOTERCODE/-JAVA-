package Pt0321;

public class Operator11Example {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {			// ���� : int i�� ���������� | i�� 1�� ���ϴ� ������
			if (i % 2 != 0)						// i/2�� �������� 0�� ���� �ʴٸ�
				continue;						//��Ƽ�� (�ݺ�����)
				
				System.out.println(i);			
		}

	}

}
