package Pt0321;

public class Operator6Example {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		b = ~a;

		System.out.println(a);
		System.out.println(b);

		b = ~b;

		System.out.println(b);
	}
}

// 비트 반전