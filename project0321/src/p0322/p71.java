package p0322;

import java.util.Scanner;

public class p71 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);				// Scanner class ����
		
		System.out.print("x �� �Է�: ");
		String strX = scanner.nextLine();						// .nextLine ���ڿ��� �Է¹����� ����ϴ� �޼ҵ� (��������) | .next : ������ �������� �ʴ´�. (������ ���� �� ���� �ϳ��� ���ڿ��� �ν�)
		int x = Integer.parseInt(strX);							//  Integer.parseInt : ������Ÿ�� String�� int�� ��ȯ
		
		System.out.print("y �� �Է�: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;										// ���� ���� result�� ���� x+y
		System.out.println("x + y: " + result);
		System.out.println();
		
		
		while(true) {											// ���ѷ���. ��ȣ�ȿ� �ִ� ������ true�� �ɶ����� �ݺ��Ѵ�
			System.out.print("�Է� ���ڿ�: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {								// �Էµ� ���ڿ��� q��� �ݺ��� �����Ѵ�
				break;

		}

		System.out.println("��� ���ڿ�: " + data);
		System.out.println();
	}
		scanner.close();
		System.out.println("����");

	}
}
