package Pt0321;

public class IfNestedExample {							// ��ø if��

	public static void main(String[] args) {
		int score = 84;
		
		if (score >= 90) {
			System.out.print("A");					//���� score�� 90���� ũ�ų� ����(true) ��� A��� false�� ���� �ڵ� ����
			if (score >= 95) {						//if�� ��ø
				System.out.print("+");				//���� score�� 95���� ũ�ų� ���� ��� +���
			} else { System.out.print("-");			//�� ������ false�� - ���
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
