package Pt0321;

public class While2Example {

	public static void main(String[] args) {
		int i = 1;						//int 변수 선언 및 초기화
		while (i <= 10) {				//while 조건식 부여 1 <= 0
			System.out.println(i);		
			i++;						//while 증감식 부여 1씩 더한다
			
			if(i == 5) {				//if문 조건 변수 i값이 5와 같다면 (true)
				break;					//중단
			}
		}

	}

}
