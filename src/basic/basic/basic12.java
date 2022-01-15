package basic.basic;

public class basic12 {

	public static void main(String[] args) {
		// 1부터 100까지의 각 정수들의 약수들을 모두 구하자.
		// 약수 : 어떤 수를 나누었을 때 나머지가 0이면 약수이다.
		// 1 => 1
		// 2 => 1, 2
		// 3 => 1, 3
		// 4 => 1, 2, 4
		
		for(int num = 1; num <= 100; num++) {
			System.out.print(num + "의 약수 : ");
			for(int j = 1; j <= num; j++) {
				if(num % j == 0)
					// 마지막 약수 뒤에는 ,를 붙이지 않는다.
					if(j == num) {
						System.out.print(j);
					}
					else {
						System.out.print(j + ", ");
					}
			}
			System.out.println();
		}
	}

}
