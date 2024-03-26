package Pt0321;

import java.util.Calendar;			//����Ÿ��

public class Long3Example {

	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY				//	��� (�빮�ڷ� ǥ���Ҷ� ��κ� ����� ����Ű�� ���̴�)
	};

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();					//	cal:�ڹ� ��ü���� �����Ǵ� �޷� Ŭ����		singleton  pattern Calendar.	getInstance : �����Ǵ� instance�� ������ ����
		int iweek = cal.get(Calendar.DAY_OF_WEEK);

		switch (iweek) {

		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("���� ���� : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("������ ���� �� �Դϴ�.");
		} else {
			System.out.println("������ �����ϴ� �� �Դϴ�.");
		}
	}

}
