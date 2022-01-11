package basic.basic;

public class basic01 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중에서 2의 배수 또는 3의 배수가 아닌 수의 합계는?
		// 2의 배수도 아니고 3의 배수도 아닌 수
		// if(num % 2 != 0) && (num % 3 != 0)
		// 1 + 5 + 7 + 11 + 13 + 17 + 19 = 73
		
		int sum = 0;
		for(int num = 1; num <= 20; num++) {
			if(num % 2 != 0 && num % 3 != 0)
				sum += num;
		}
		System.out.println("합계 : " + sum);
	
	}

}
