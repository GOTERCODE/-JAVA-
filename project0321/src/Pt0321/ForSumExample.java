package Pt0321;							//1���� 10������ �� ���ϱ�

public class ForSumExample {

	public static void main(String[] args) {
		int sum = 0;					//int sum ���� ���� sum=0
		
		for(int i=1;i<=10;i++) {		// i=1 ���� ����, �ʱ�ȭ | i=10 ���ǽ� �ο� | i++ 10�� �����ϴ� ������ �ο� 
			sum += i;
			System.out.println("sum = " + sum);
		}

		System.out.println("sum = " + sum);
	}

}
