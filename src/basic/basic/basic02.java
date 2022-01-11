package basic.basic;

public class basic02 {

	public static void main(String[] args) {
		// 1 + (1+2) + (1+2+3) + ... + (1+2+3+ ... + 10) 까지의 합은?

		System.out.println("첫번째 방법");
		int sum = 0;
		int i, j;
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= i; j++) {
				sum += j;
			}
			System.out.println(i + "번째 " + "총합계 : " + sum);
		}

		System.out.println("두번째 방법");
		sum = 0;
		int total = 0;
		for(int num = 1; num <= 10; num++) {
			sum 	+= num;
			total	+= sum;
			System.out.println("num" + num + " = " + "sum" + sum + " = " + total);
		}
	}

}
