package Pt0321;

import java.util.Calendar;			//열거타입

public class Long3Example {

	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY				//	상수 (대문자로 표현할땐 대부분 상수를 가르키는 것이다)
	};

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();					//	cal:자바 자체에서 제공되는 달력 클래스		singleton  pattern Calendar.	getInstance : 생성되는 instance의 갯수를 제한
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

		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 공부하는 날 입니다.");
		}
	}

}
