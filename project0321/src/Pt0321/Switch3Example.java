package Pt0321;

public class Switch3Example {

	public static void main(String[] args) {
		String position = "����";					//������ position ����, ������ Ÿ�� String
		switch (position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		case "�븮":
			System.out.println("300����");
			break;
		default:
			System.out.println("������ �Է����ּ���");
			break;
		}

	}

}