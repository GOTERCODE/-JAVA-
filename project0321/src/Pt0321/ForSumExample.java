package Pt0321;							//1부터 10까지의 합 구하기

public class ForSumExample {

	public static void main(String[] args) {
		int sum = 0;					//int sum 변수 선언 sum=0
		
		for(int i=1;i<=10;i++) {		// i=1 변수 선언, 초기화 | i=10 조건식 부여 | i++ 10씩 증가하는 증감식 부여 
			sum += i;
			System.out.println("sum = " + sum);
		}

		System.out.println("sum = " + sum);
	}

}
