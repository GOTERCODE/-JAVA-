package Pt0321;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1);			//num1(10)�� num2(10)�� ������
		System.out.println("result2 : " + result2);			//num1(10)�� num2(10)�� �ٸ���
		System.out.println("result3 : " + result3);			//num1(10)�� num2(10)���� �۰ų� ������
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4 : " + result4);			//char1(�ƽ�Ű�ڵ� A)�� char2(�ƽ�Ű�ڵ� B)���� ������

	}

}
