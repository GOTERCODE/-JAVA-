package Pt0321;

public class garbagevalueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		byte var2 = 125;
		
		for (int i = 0;i < 5; i++) {
			var1++;							//var1�� 1�� ������Ų��	(var1 = var1 + 1;)
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2:" + var2);
		}

	}
}

// ����Ʈ ������ Ÿ�Կ����� 127 �̻��� int�� ǥ���� �� ���� (overflow)