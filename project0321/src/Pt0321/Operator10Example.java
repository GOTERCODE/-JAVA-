package Pt0321;

public class Operator10Example {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;							//int data type�� �Ҵ�Ǵ� �뷮 (4byte) �ʰ� (overflow)
		long lz1 = (long)x * (long)y;			//long data type(8byte)���� ��ȯ(type casting) �� ����, long ���
		long lz2 = (long) (x * y);				//int data type���� �����Ͽ� ����� -727379968�� ���� ����(overflow �߻�) �� �� long���� ��ȯ(type casting)�Ͽ� -727379968


		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}

}
