package Pt0321;

public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012; // 8����
		int var3 = 0xa; // 16����

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		System.out.printf("8���� : 0%o\n", var2);
		System.out.printf("16���� : 0x%x\n", var3);
		System.out.printf("var3 10���� : %d\n", var3);
	}
}