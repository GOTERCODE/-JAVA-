package Pt0321;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "java";					// ���ڿ� ���					java
		String str2 = "JDK";					// ���ڿ� ���					JDK

		String str3 = str1 + str2;				// ���ڿ� + ���ڿ�				javaJDK
		String str4 = str1 + " " + str2;		// ���ڿ� + ���ڿ� + ���ڿ�		java JDK
		
		String str5 = "JDK" + 3 + 3.0;			// ���ڿ� + int + double		JDK33.0
		String str6 = 3 + 3.0 + "JDK";			// int + double + ���ڿ�		6.0JDK
		
		System.out.println(str1);
		System.out.println(str2);				
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);				
		System.out.println(str6);				
	}
}
