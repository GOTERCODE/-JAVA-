package Pt0321;

public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012; // 8진수
		int var3 = 0xa; // 16진수

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		System.out.printf("8진수 : 0%o\n", var2);
		System.out.printf("16진수 : 0x%x\n", var3);
		System.out.printf("var3 10진수 : %d\n", var3);
	}
}