package p0322;																//문자열의 형식 설정

public class p29 {

	public static void main(String[] args) {
		int value = 123;
		
		System.out.printf("상품의 가격:%d원\n", value);							//정수
		System.out.printf("상품의 가격:#6d월\n", value);						// 6자리 정수 왼쪽 빈자리 공백
		System.out.printf("상품의 가격:%-6d원\n", value);						// 6자리 정수 오른쪽 빈자리 공백
		System.out.printf("상품의 가격:%06d월\n", value);						// 6자리 정수 왼쪽 빈자리 0 채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);			//실수 소숫점 두자리까지 출력 10칸중 왼쪽 빈자리 공백
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);			//1: 6칸 왼쪽 빈자리 공백(%6d) | 홍길동: 10칸 오른쪽 빈자리 공백(%10s) | 도적: 10칸 왼쪽 빈자리 공백(%-10s)
		
	}
}
