package Pt0321;

public class While2Example {

	public static void main(String[] args) {
		int i = 1;						//int ���� ���� �� �ʱ�ȭ
		while (i <= 10) {				//while ���ǽ� �ο� 1 <= 0
			System.out.println(i);		
			i++;						//while ������ �ο� 1�� ���Ѵ�
			
			if(i == 5) {				//if�� ���� ���� i���� 5�� ���ٸ� (true)
				break;					//�ߴ�
			}
		}

	}

}
