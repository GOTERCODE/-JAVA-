package Pt0321;

public class Operator11Example {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {			// 조건 : int i가 같을때까지 | i에 1씩 더하닌 증감식
			if (i % 2 != 0)						// i/2의 나머지가 0과 같지 않다면
				continue;						//컨티뉴 (반복수행)
				
				System.out.println(i);			
		}

	}

}
