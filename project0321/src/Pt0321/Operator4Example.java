package Pt0321;

public class Operator4Example {

	public static void main(String[] args) {
		int x = 5;
		int y  = 8;
		int result1 = ++x +10;
		int result2 = y++ +10;
		
		System.out.println("x : " + x);		//x+1 출력
		System.out.println("y : " + y);		//y+1 출력
		
		int z = ++x + y++;					//z = 5+1+8+1
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}

}
