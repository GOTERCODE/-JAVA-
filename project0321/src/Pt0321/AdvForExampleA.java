package Pt0321;

public class AdvForExampleA {

	public static void main(String[] args) {

				int[] scores = {9, 7, 8, 9, 8};
				
				int sum = 0;							//�Ϲ� for��
				for(int i=0;i<=4;i++) {
					sum += scores[i];					//score �迭�� �ε����� i(1)�� �����Ͽ� ���ϴ� ������
				}
				
				
				
				//for(int s : scores) {					//���� for�� (�迭�� ����Ѵ�)
				//	sum +=s;
				//}
				System.out.println("sum : " + sum);
			}

		


	}
