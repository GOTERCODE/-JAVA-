package Pt0321;

public class BreakExample {

	public static void main(String[] args) {
		
		int i = 1;								//int i ���� ���� i=1
		
		while (true) {							//���ѹݺ�
			System.out.println(i);
			
			if (i == 6) 						//���� i�� 6�� ���ٸ�
				break;							//����
				
			i = i + 1;							//������
		}

	}

}
