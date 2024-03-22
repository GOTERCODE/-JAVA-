package Pt0321;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "java";					// 문자열 출력					java
		String str2 = "JDK";					// 문자열 출력					JDK

		String str3 = str1 + str2;				// 문자열 + 문자열				javaJDK
		String str4 = str1 + " " + str2;		// 문자열 + 문자열 + 문자열		java JDK
		
		String str5 = "JDK" + 3 + 3.0;			// 문자열 + int + double		JDK33.0
		String str6 = 3 + 3.0 + "JDK";			// int + double + 문자열		6.0JDK
		
		System.out.println(str1);
		System.out.println(str2);				
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);				
		System.out.println(str6);				
	}
}
