package basic.baekjoon;

import java.util.Scanner;

public class Main02438 {
		
	public static void main(String[] args) {
		// 3. for문 9 - 2438 별찍기 - 1
		// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

