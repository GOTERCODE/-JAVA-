package Pt0321;

import java.util.Scanner;

public class ForSum2Example {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int inp = s1.nextInt();
		int sum = 0;
		s1.close();
		for(int i=1; i <= inp; i++) {		//�Է°��� ���� ���Ѵ�
			sum += i;
		}

		System.out.println("sum = " + sum);
	}

}
