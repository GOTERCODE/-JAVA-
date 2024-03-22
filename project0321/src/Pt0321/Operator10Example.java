package Pt0321;

public class Operator10Example {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;							//int data type에 할당되는 용량 (4byte) 초과 (overflow)
		long lz1 = (long)x * (long)y;			//long data type(8byte)으로 변환(type casting) 후 연산, long 출력
		long lz2 = (long) (x * y);				//int data type으로 연산하여 결과값 -727379968이 먼저 도출(overflow 발생) 된 후 long으로 변환(type casting)하여 -727379968


		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}

}
