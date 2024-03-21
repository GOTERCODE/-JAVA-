package Pt0321;

public class PPExample {

	public static void main(String[] args) {
		int A = 5;
		
		System.out.println(A++);		// 출력이 끝난뒤에 A에 1을 더한다
		System.out.println(A);			// A+1=6
		
		int B = 5;
		
		System.out.println(++B);		// 출력을 하기전에 B에 1을 더한 뒤 출력한다. B+1=6
		System.out.println(B);			// 6

	}

}
