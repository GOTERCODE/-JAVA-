package Pt0321;

public class IfExample {

	public static void main(String[] args) {
		int score = 75;										//75
		
		if (score >= 90) {									//false
			System.out.println("A");
		} else if (score >= 80) {							//false
			System.out.println("B");
		} else if (score >= 70) {							//true
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
