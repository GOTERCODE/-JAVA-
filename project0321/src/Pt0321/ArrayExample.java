package Pt0321;

public class ArrayExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90 ,87 };			//배열
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.println("sum : " + sum);		//합계
		
		double avg = (double) sum / 3;			//평균 (int 에서 double로 type casting
		
//		System.out.print("avg : ");
//		System.out.println(String.format("%.3f", avg));
		
		System.out.print("avg : ");
		System.out.printf("%.3f\n", avg);
		}

	}


