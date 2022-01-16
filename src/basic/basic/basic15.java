package basic.basic;

public class basic15 {

	public static void main(String[] args) {
		// 1부터 누적해서 더해 나가다보면(1 + 2 + 3 + ...)
		// 누적 합계가 100을 넘지 않는 제일 큰 수는 무엇인가요? (while문 사용)
		// 정답 : 13까지 누적하면 91
		
		int sum = 0;
		int num = 0;
		
		while(sum <= 100) { // sum + num <= 100
			sum = sum + ++num; // sum += ++num;
			if(sum >= 100) break;
			System.out.println(num + " => " + sum);
		}
	}

}
