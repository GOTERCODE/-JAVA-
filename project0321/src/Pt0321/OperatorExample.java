package Pt0321;

public class OperatorExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int a = 5, b = 6, c = 7;
		int res1 = 0, res2 = 0;
				
		a = b = c = 8;
		res1 = 100 * 2 + 7 % 5;			//	연산자 우선순위에 따라 * % + = 순으로 연산한다 200 + 2(7 % 5) = 202
		res2 = 100 * (2 + 7) % 5;		//  900 % 5 = 0
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(res1);
		System.out.println(res2);

	}

}
