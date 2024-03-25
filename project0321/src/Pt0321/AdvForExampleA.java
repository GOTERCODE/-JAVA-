package Pt0321;

public class AdvForExampleA {

	public static void main(String[] args) {

				int[] scores = {9, 7, 8, 9, 8};
				
				int sum = 0;							//일반 for문
				for(int i=0;i<=4;i++) {
					sum += scores[i];					//score 배열에 인덱스값 i(1)씩 설정하여 더하는 증감식
				}
				
				
				
				//for(int s : scores) {					//향상된 for문 (배열을 사용한다)
				//	sum +=s;
				//}
				System.out.println("sum : " + sum);
			}

		


	}
