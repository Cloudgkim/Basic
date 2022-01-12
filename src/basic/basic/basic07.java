package basic.basic;

public class basic07 {

	public static void main(String[] args) {
		// Fibonacci 수열
		// 앞의 두 수를 더해서 다음 수를 만든다.
		// 1, 1로 시작해서 20번째까지 피보나치 수열을 보여주세요.
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 앞의 두 수를 더한 값을 저장할 변수
		
		// 첫번째와 두번째 값은 이미 제시되었기 때문에 제외하고 18번(20-2)만큼 반복한다.
		
		
		System.out.print(num1 + ", " + num2);
		for(int i = 0; i < 18; i++) {
			num3 = num1 + num2; // 3번째 값은 첫번째와 두번째 값을 더해서 만든다. 
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
		
	}

}
