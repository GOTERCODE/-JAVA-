package Pt0321;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "JBEdu"; 					// ��ü�Ҵ�
		String strVar2 = "JBEdu"; 					// ��ü�Ҵ�

		if (strVar1 == strVar2) { 					// heap�� ���� ���� �Ҵ��Ͽ���. [������ ����]
			System.out.println("������ ����");
		} else {
			System.out.println("������ �ٸ�");
		}

		if (strVar1.equals(strVar2)) { 				// �Ҵ�� �������� ���Ѵ�. | heap ���� ������ �Ҵ��Ͽ��⿡ ���ڿ� ���� ���� [���ڿ��� ����]
			System.out.println("�� ���ڿ��� ����");
		}

		String strVar3 = new String("JBEdu"); 		// strVar3 ���ο� ��ü �Ҵ�
		String strVar4 = new String("JBEdu");		// strVar4 ���ο� ��ü �Ҵ�
													// heap�� ���� �ٸ� �������� �Ҵ�� (���� �ٸ� ��ü)
		if (strVar3 == strVar4) {
			System.out.println("������ ����"); 		// ������ ������ �����ʴ�. [������ �ٸ�]
		} else {
			System.out.println("������ �ٸ�");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("�� ���ڿ��� ����");		// ���ڿ��� �񱳽� �� ��ü�� �Ҵ�� ���ڿ��� ��ġ�ϹǷ� ���ڿ��� ���� [���ڿ��� ����]
		}
	}
}
