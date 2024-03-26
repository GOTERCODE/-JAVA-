package Pt0321;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "JBEdu"; 					// 객체할당
		String strVar2 = "JBEdu"; 					// 객체할당

		if (strVar1 == strVar2) { 					// heap에 같은 참조 할당하였다. [참조가 같음]
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}

		if (strVar1.equals(strVar2)) { 				// 할당된 설정값을 비교한다. | heap 같은 참조를 할당하였기에 문자열 또한 같다 [문자열이 같음]
			System.out.println("두 문자열이 같음");
		}

		String strVar3 = new String("JBEdu"); 		// strVar3 새로운 객체 할당
		String strVar4 = new String("JBEdu");		// strVar4 새로운 객체 할당
													// heap에 서로 다른 공간으로 할당됨 (서로 다른 객체)
		if (strVar3 == strVar4) {
			System.out.println("참조가 같음"); 		// 때문에 참조가 같지않다. [참조가 다름]
		} else {
			System.out.println("참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("두 문자열이 같음");		// 문자열로 비교시 두 객체에 할당된 문자열은 일치하므로 문자열은 같다 [문자열이 같음]
		}
	}
}
