package Pt0321;

public class garbagevalueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		byte var2 = 125;
		
		for (int i = 0;i < 5; i++) {
			var1++;							//var1을 1씩 증가시킨다	(var1 = var1 + 1;)
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2:" + var2);
		}

	}
}

// 바이트 데이터 타입에서는 127 이상의 int가 표현될 수 없다 (overflow)