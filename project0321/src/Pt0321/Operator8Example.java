package Pt0321;

public class Operator8Example {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("result1 : " + result);
		
		int result2 = v1 - v2;
		System.out.println("result2 : " + result2);

		int result3 = v1 * v2;
		System.out.println("result3 : " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 : " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 : " + result5);
		
		double result6 = (double)v1 / v2;
		System.out.println("result6 : " + result6);  // 타입 캐스팅 ( int > double)
		
		double result7 = v1 / v2;
		System.out.println("result7 : " + result7);
	}
}
