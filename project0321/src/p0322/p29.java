package p0322;																//���ڿ��� ���� ����

public class p29 {

	public static void main(String[] args) {
		int value = 123;
		
		System.out.printf("��ǰ�� ����:%d��\n", value);							//����
		System.out.printf("��ǰ�� ����:#6d��\n", value);						// 6�ڸ� ���� ���� ���ڸ� ����
		System.out.printf("��ǰ�� ����:%-6d��\n", value);						// 6�ڸ� ���� ������ ���ڸ� ����
		System.out.printf("��ǰ�� ����:%06d��\n", value);						// 6�ڸ� ���� ���� ���ڸ� 0 ä��
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, area);			//�Ǽ� �Ҽ��� ���ڸ����� ��� 10ĭ�� ���� ���ڸ� ����
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);			//1: 6ĭ ���� ���ڸ� ����(%6d) | ȫ�浿: 10ĭ ������ ���ڸ� ����(%10s) | ����: 10ĭ ���� ���ڸ� ����(%-10s)
		
	}
}
